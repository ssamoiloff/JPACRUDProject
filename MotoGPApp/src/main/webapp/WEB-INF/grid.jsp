<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<jsp:include page="bootstrapHead.jsp" />  
<!-- XXX -->
</head>
<body>
<jsp:include page="navbar.jsp" />
<!-- XXX -->
	<main class="container-fluid">
	<table class="table">
			<thead class="thead thead-dark">
				<tr>
					<th>Race Number</th>
					<th>Name</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="r" items="${riders}">
					<tr>
						<td>${r.riderNumber}</td>
						<td>${r.firstName} ${r.lastName}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</main>
<jsp:include page="bootstrapFoot.jsp" />  <!-- XXX -->
</body>
</html>