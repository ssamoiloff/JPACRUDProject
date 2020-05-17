<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Rider</title>
<jsp:include page="bootstrapHead.jsp" />
</head>
<body>
<jsp:include page="navbar.jsp" />
	<h1>Create Your MotoGP Rider</h1>
	
	<form action="addRider.do" method="POST">
	</form>
	
<jsp:include page="bootstrapFoot.jsp" />
</body>
</html>