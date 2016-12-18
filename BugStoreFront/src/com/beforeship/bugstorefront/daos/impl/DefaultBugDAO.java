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
package com.beforeship.bugstorefront.daos.impl;

import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.beforeship.bugstorefront.daos.BugDAO;
import com.beforeship.model.BugModel;


/**
 *
 */
@Component(value = "bugDAO")
public class DefaultBugDAO implements BugDAO
{
	@Autowired
	private FlexibleSearchService flexibleSearchService;

	@Resource
	private ModelService modelService;


	@Override
	public List<BugModel> findBugs()
	{
		final String queryString = //
				"SELECT {p:" + BugModel.PK + "} "//
						+ "FROM {" + BugModel._TYPECODE + " AS p} ";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);

		return flexibleSearchService.<BugModel> search(query).getResult();
	}

	@Override
	public List<BugModel> findBugByCode(final String code)
	{
		final String queryString = //
				"SELECT {p:" + BugModel.PK + "}" //
						+ "FROM {" + BugModel._TYPECODE + " AS p} "//
						+ "WHERE " + "{p:" + BugModel.CODE + "}=?code ";

		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		query.addQueryParameter("code", code);

		return flexibleSearchService.<BugModel> search(query).getResult();
	}

	@Override
	public void saveBug(final BugModel bug)
	{
		modelService.save(bug);
	}

	@Override
	public void deleteBug(final BugModel bugModel)
	{
		modelService.remove(bugModel);
	}

}
