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
package com.beforeship.bugstorefront.facades;

import java.util.List;

import com.beforeship.storefront.data.BugData;


/**
 *
 */
public interface BugFacade
{
	List<BugData> getBugs();

	BugData getBug(String name);

	void addBug(final BugData bugData);

	void removeBug(String bugName);

	void saveBug(final BugData bugData);
}
