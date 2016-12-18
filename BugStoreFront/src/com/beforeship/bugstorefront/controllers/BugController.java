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
package com.beforeship.bugstorefront.controllers;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.beforeship.bugstorefront.facades.impl.DefaultBugFacade;
import com.beforeship.storefront.data.BugData;


/**
 *
 */
@Controller
public class BugController
{
	@Resource
	private DefaultBugFacade bugFacade;

	@RequestMapping(value = "/bugs")
	public String showBugs(final Model model)
	{
		final List<BugData> bugs = bugFacade.getBugs();
		System.out.println("----" + bugFacade.getBugs().size());
		for (int i = 0; i < bugs.size(); i++)
		{
			System.out.println("Title:" + bugs.get(i).getName() + "Assign:" + bugs.get(i).getAssigned() + "Severity:"
					+ bugs.get(i).getSeverity() + "Desc:" + bugs.get(i).getDesc());
		}
		model.addAttribute("bugs", bugs);
		return "bug_list";
	}

	@RequestMapping(value = "/bugs/{bugName}")
	public String ShowBugDetail(@PathVariable final String bugName, final Model model) throws UnsupportedEncodingException
	{
		final BugData bugData = bugFacade.getBug(bugName);
		System.out.println("Title:" + bugData.getName() + "Assign:" + bugData.getAssigned() + "Severity:" + bugData.getSeverity()
				+ "Desc:" + bugData.getDesc());
		model.addAttribute("bug", bugData);
		return "view_bug";
	}

	@RequestMapping(value = "/bugs/remove/{bugName}")
	public String removeBug(@PathVariable final String bugName, final Model model) throws UnsupportedEncodingException
	{
		bugFacade.removeBug(bugName);

		return "redirect:/bugs";
	}

	@RequestMapping(value = "/addBug", method = RequestMethod.POST)
	public String addBug(final BugData bugData, final Model model)
	{
		//TODO:前端部分
		bugFacade.addBug(bugData);
		return "redirect:./bugs";
	}

	@RequestMapping(value = "/editBug", method = RequestMethod.POST)
	public String editBug(final BugData bugData, final Model model)
	{
		bugFacade.saveBug(bugData);
		return "redirect:./bugs";
	}

}
