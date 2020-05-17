<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

		<div class="homepage-search">
			<form action="findByRiderNumber.do">
				<input type="text" name="rn" placeholder="Search by rider's race number" />
				<button type="submit">Submit</button>
			</form>
			<br><br>
			<form action="findByFirstName.do">
				<input type="text" name="fn" placeholder="Search by first name" />
				<button type="submit">Submit</button>
			</form>
			<br><br>
			<form action="findByKeyword.do">
				<input type="text" name="kw" placeholder="Search by keyword" />
				<button type="submit">Submit</button>
			</form>
		</div>
	</main>
	<jsp:include page="bootstrapFoot.jsp" />
	<!-- XXX -->
</body>
</html>