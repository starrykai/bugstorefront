<%@page import="com.beforeship.storefront.data.BugData"%>
<%@page import="com.beforeship.storefront.data.CommentData"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<link rel="stylesheet" href="../resources/css/blueprint/screen.css" />
		<link rel="stylesheet" href="../resources/css/blueprint/plugins/buttons/screen.css" />
		<link rel="stylesheet" href="../resources/css/blueprint/plugins/link-icons/screen.css" />
		<link rel="stylesheet" href="../resources/css/app.css" />
	</head>
	
	<body>
		<div class="container">
			<div id="bug_info">
				<fieldset>
					<legend>Bug Information</legend>
					
					<div id="bug_form">
						<p>
							<label>Title:</label> <br />
							<span>${bug.name}</span>
						</p>
						<p>
							<label>Severity:</label> <br />
							<span>${bug.severity}</span>
						</p>
						<p>
							<label>Assigned To:</label> <br />
							<span>${bug.assigned}</span>
						</p>
						<p>
							<label>Description:</label><br />
							<textarea readonly="readonly">${bug.desc}</textarea>
						</p>
					</div>
				</fieldset>
				<fieldset>
					<legend>Comments</legend>
					<div id="comment_list">
						<c:forEach var="commentData" items="${ bug.bugcomments }">
							<div class="comment prepend-top">
								<div class="comment_head">
									${commentData.commentTime}&nbsp&nbsp${commentData.username}
								</div>
								<div class="comment_body">
									${commentData.content}
								</div>
							</div>
						</c:forEach>
					</div>
				</fieldset>
				<fieldset>
					<legend>Add A Comment</legend>
					<div id="comment_form">
						<textarea></textarea> <br>
						<a class="button">Submit</a>
						<a class="button" href="../bugs">Back</a>
					</div>
				</fieldset>
			</div>
		</div>
	</body>
</html>