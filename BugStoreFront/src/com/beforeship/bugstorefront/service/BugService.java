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
package com.beforeship.bugstorefront.service;

import java.util.List;

import com.beforeship.model.BugModel;


/**
 *
 */
public interface BugService
{
	public List<BugModel> getBugs();

	public BugModel getBugForCode(String code);

	public void saveBug(final BugModel bugModel);

	public void removeBug(final String code);

	public void updateBug(final BugModel bugModel);
}
