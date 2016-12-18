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
package com.beforeship.bugstorefront.service.impl;

import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.beforeship.bugstorefront.daos.BugDAO;
import com.beforeship.bugstorefront.service.BugService;
import com.beforeship.model.BugModel;


/**
 *
 */
@Component(value = "bugService")
public class DefaultBugService implements BugService
{
	@Resource
	private BugDAO bugDAO;

	@Override
	public List<BugModel> getBugs()
	{
		return bugDAO.findBugs();
	}

	@Override
	public BugModel getBugForCode(final String code)
	{
		final List<BugModel> result = bugDAO.findBugByCode(code);
		if (result.isEmpty())
		{
			throw new UnknownIdentifierException("Bug with code '" + code + "' not found!");
		}
		else if (result.size() > 1)
		{
			throw new AmbiguousIdentifierException("Bug code '" + code + "' is not unique, " + result.size() + " Bugs found!");
		}
		return result.get(0);
	}

	@Override
	public void saveBug(final BugModel bugModel)
	{
		bugDAO.saveBug(bugModel);
	}

	@Override
	public void removeBug(final String code)
	{
		final BugModel bugModel = this.getBugForCode(code);
		if (bugModel != null)
		{
			bugDAO.deleteBug(bugModel);
		}
	}

	@Override
	public void updateBug(final BugModel bugModel)
	{
		final BugModel editedBugModel = this.getBugForCode(bugModel.getCode());
		if (editedBugModel != null)
		{
			editedBugModel.setCode(bugModel.getCode());
			editedBugModel.setAssigned(bugModel.getAssigned());
			editedBugModel.setDescription(bugModel.getDescription());
			bugDAO.saveBug(editedBugModel);
		}
	}
}
