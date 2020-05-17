<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rider Details</title>
<jsp:include page="bootstrapHead.jsp" />
</head>
<body>
<jsp:include page="navbar.jsp" />
	<h1>${rider.firstName} ${rider.lastName}</h1>
	
	<table>
	<thead class="thead thead-dark">
		<tr>
		
		</tr>
	</thead>
	</table>
<jsp:include page="bootstrapFoot.jsp" />
</body>
</html>