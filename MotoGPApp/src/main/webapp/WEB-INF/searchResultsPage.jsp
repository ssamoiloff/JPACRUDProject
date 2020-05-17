<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Results</title>
<jsp:include page="bootstrapHead.jsp" />
</head>

<body>
	<jsp:include page="navbar.jsp" />
	<main class="container-fluid">

		<c:choose>
			<c:when test="${empty riders}">
				<strong>No results found</strong>
			</c:when>
			<c:otherwise>
				<c:forEach var="r" items="${riders}">
					${r.firstName} ${r.lastName}
					<br>
				</c:forEach>
			</c:otherwise>
		</c:choose>

	</main>
	<jsp:include page="bootstrapFoot.jsp" />
	<!-- XXX -->
</body>
</html>