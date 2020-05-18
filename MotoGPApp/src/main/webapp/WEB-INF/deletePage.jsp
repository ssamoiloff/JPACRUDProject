<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Rider</title>
<jsp:include page="bootstrapHead.jsp" />
</head>
<body>
	<jsp:include page="navbar.jsp" />
	<main class="container-fluid">
		<form action=deleteRider.do method="POST">
			<table>
				<thead>
					<tr>
						<th></th>
						<th>ID</th>
						<th>Race Number</th>
						<th>Name</th>
					</tr>
				</thead>
				<c:forEach var="r" items="${riders}">
					<tr>
						<td><input type="checkbox" name="list" value="${r.id}"></td>
						<td>${r.id}</td>
						<td>${r.riderNumber}</td>
						<td>${r.firstName} ${r.lastName}</td>
					</tr>
				</c:forEach>
			</table>
			<div class="btn-block">
				<button type="submit">Delete</button>
			</div>
		</form>
	</main>
	<jsp:include page="bootstrapFoot.jsp" />
</body>
</html>