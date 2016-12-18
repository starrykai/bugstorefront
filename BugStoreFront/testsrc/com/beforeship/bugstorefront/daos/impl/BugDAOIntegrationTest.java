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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import de.hybris.platform.servicelayer.model.ModelService;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.beforeship.bugstorefront.daos.BugDAO;
import com.beforeship.model.BugModel;


/**
 *
 */
public class BugDAOIntegrationTest
{
	@Resource
	private BugDAO bugDAO;

	@Resource
	private ModelService modelService;

	private static final String BUGTITLE = "TestBBugTitle";

	private static final String ASSIGNED = "Admin";

	private static final String DESCRIPTION = "test-desc-desc";

	//		按title查找为空
	//		查找所有的bug为空
	//		添加一个bug，查询所有bug数量为1
	//		测试按title查找bug

	@Test
	public void bugTest()
	{

		final List<BugModel> bug = bugDAO.findBugByCode(BUGTITLE);
		assertTrue("no bug will return", bug.isEmpty());

		List<BugModel> allBugs = bugDAO.findBugs();
		final int size = allBugs.size();

		final BugModel testBug = new BugModel();
		testBug.setCode(BUGTITLE);
		testBug.setAssigned(ASSIGNED);
		testBug.setDescription(DESCRIPTION);
		modelService.save(testBug);

		allBugs = bugDAO.findBugs();
		assertEquals(size + 1, allBugs.size());
		assertEquals("Unexpected bug find", testBug, allBugs.get(allBugs.size() - 1));

	}
}
