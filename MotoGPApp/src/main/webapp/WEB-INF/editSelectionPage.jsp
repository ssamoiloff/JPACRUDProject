<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rider Selection</title>
<jsp:include page="bootstrapHead.jsp" />
</head>
<body>
	<jsp:include page="navbar.jsp" />
	<main class="container-fluid">

		<c:forEach var="r" items="${riders}">
			<form action=editRider.do method="POST">

				<input type="hidden" name="id" value="${r.id}"/><br>
				<strong>Race #: </strong>${r.riderNumber}<br>
				<strong>Name:   </strong>${r.firstName} ${r.lastName}
				<br><br>
				<div class="btn-block">
					<button type="submit">Edit</button>
				</div>
			</form>
			<br>
		</c:forEach>

	</main>
	<jsp:include page="bootstrapFoot.jsp" />
</body>
</html>