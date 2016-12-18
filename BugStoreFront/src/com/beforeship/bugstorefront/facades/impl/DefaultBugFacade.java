/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */
package com.beforeship.bugstorefront.facades.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.format.datetime.DateFormatter;
import org.springframework.format.support.DefaultFormattingConversionService;
import org.springframework.stereotype.Component;

import com.beforeship.bugstorefront.facades.BugFacade;
import com.beforeship.bugstorefront.service.BugService;
import com.beforeship.model.BugCommentModel;
import com.beforeship.model.BugModel;
import com.beforeship.storefront.data.BugData;
import com.beforeship.storefront.data.CommentData;


/**
 *
 */
@Component(value = "bugFacade")
public class DefaultBugFacade implements BugFacade
{
	@Resource
	private BugService bugService;

	@Override
	public List<BugData> getBugs()
	{
		System.out.println("getBugs service -----");
		final List<BugModel> bugModels = bugService.getBugs();
		final List<BugData> bugFacadeData = new ArrayList<BugData>();
		for (final BugModel bug : bugModels)
		{
			final BugData tmpBugData = new BugData();
			tmpBugData.setName(bug.getCode());
			tmpBugData.setDesc(bug.getDescription());
			tmpBugData.setAssigned(bug.getAssigned());
			tmpBugData.setSeverity(bug.getSeverity().toString());
			final DateFormatter dateFormatter = new DateFormatter();
			final DefaultFormattingConversionService conversionService = new DefaultFormattingConversionService();
			conversionService.addFormatter(dateFormatter);
			dateFormatter.setPattern("yyyy年MM月dd日");
			tmpBugData.setCreateTime(conversionService.convert(bug.getCreationtime(), String.class));
			bugFacadeData.add(tmpBugData);
		}
		System.out.println("getBugs service -----" + bugFacadeData);
		return bugFacadeData;
	}

	@Override
	public BugData getBug(final String name)
	{
		BugModel bug = null;
		if (name == null)
		{
			throw new IllegalArgumentException("Bug with name " + name + " not found.");
		}
		else
		{
			bug = bugService.getBugForCode(name);
			if (bug == null)
			{
				return null;
			}
		}
		//		the comments of bug
		final List<CommentData> bugCommentsData = new ArrayList<CommentData>();
		if (bug.getBugComments() != null)
		{
			final Iterator<BugCommentModel> bugCommentsIterator = bug.getBugComments().iterator();
			while (bugCommentsIterator.hasNext())
			{
				final BugCommentModel commentModel = bugCommentsIterator.next();
				final CommentData commentData = new CommentData();
				final String commentUserName = commentModel.getUsername();
				final String commentContent = commentModel.getContent();
				final DateFormatter dateFormatter = new DateFormatter();
				final DefaultFormattingConversionService conversionService = new DefaultFormattingConversionService();
				conversionService.addFormatter(dateFormatter);
				dateFormatter.setPattern("yyyy年MM月dd日");
				final String commentCreateTime = conversionService.convert(commentModel.getCreationtime(), String.class);

				commentData.setContent(commentContent);
				commentData.setUsername(commentUserName);
				commentData.setCommentTime(commentCreateTime);

				bugCommentsData.add(commentData);

				System.out.println("Bug Comment: " + commentCreateTime + commentUserName + commentContent);
			}
		}

		//		bug master data
		final BugData tmpBugData = new BugData();
		tmpBugData.setName(bug.getCode());
		tmpBugData.setDesc(bug.getDescription());
		tmpBugData.setAssigned(bug.getAssigned());
		tmpBugData.setSeverity(bug.getSeverity().toString());
		tmpBugData.setBugcomments(bugCommentsData);

		return tmpBugData;
	}

	@Override
	public void addBug(final BugData bugData)
	{
		final BugModel bugModel = new BugModel();
		bugModel.setCode(bugData.getName());
		bugModel.setAssigned(bugData.getAssigned());
		bugModel.setDescription(bugData.getDesc());

		bugService.saveBug(bugModel);
	}

	@Override
	public void removeBug(final String bugName)
	{
		bugService.removeBug(bugName);
	}

	@Override
	public void saveBug(final BugData bugData)
	{
		final BugModel bugModel = new BugModel();
		bugModel.setCode(bugData.getName());
		bugModel.setAssigned(bugData.getAssigned());
		bugModel.setDescription(bugData.getDesc());

		bugService.saveBug(bugModel);
	}
}
