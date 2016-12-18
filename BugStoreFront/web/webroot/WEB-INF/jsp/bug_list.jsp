<%@page import="com.beforeship.storefront.data.BugData"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<link rel="stylesheet" href="resources/css/blueprint/screen.css" />
		<link rel="stylesheet" href="resources/css/blueprint/plugins/buttons/screen.css" />
		<link rel="stylesheet" href="resources/css/blueprint/plugins/link-icons/screen.css" />
	</head>
	
	<body>
		<div class="container">
			<div id="bug_list">
				<div id="bug_nav">
					<a class="button" href="resources/html/add_bug.html">Create A Bug</a>	
				</div>
				<table>
					<thead>
						<tr>
							<th>
								No.
							</th>
							<th>
								Assignee
							</th>
							<th>
								Title
							</th>
							<th>
								Severity
							</th>
							<th>
								Description
							</th>
							<th>
								Created Date
							</th>
							<th>
								Actions
							</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="bug" items="${ bugs }" varStatus="status">
								<tr>
									<td>${ status.index + 1}</td>
									<td>${bug.assigned}</td>
									<td>${bug.name}</td>
									<td>${bug.severity }</td>
									<td>${bug.desc}</td>
									<td>${bug.createTime}</td>
									<td>
										<a href="./bugs/${bug.name}">View</a>
										<a href="add_bug.html">Edit</a>
										<a href="./bugs/remove/${bug.name}">Delete</a>
									</td>
								</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</body>
</html>