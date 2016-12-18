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
package com.beforeship.bugstorefront.daos;

import java.util.List;

import com.beforeship.model.BugModel;


/**
 * 增删改查interface
 */
public interface BugDAO
{

	List<BugModel> findBugs();

	List<BugModel> findBugByCode(String code);

	void saveBug(BugModel bug);

	void deleteBug(final BugModel bugModel);

}
