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
					<th>Age</th>
					<th>Country</th>
					<th>Team</th>
					<th>Bike</th>
					<th>Years Active</th>
					<th>Wins</th>
					<th>Podiums</th>
					<th>Poles</th>
					<th># of Fastest Race Laps</th>
					<th>Championships</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="r" items="${riders}">
					<tr>
						<td>${r.riderNumber}</td>
						<td>${r.firstName} ${r.lastName}</td>
						<td>${r.age}</td>
						<td>${r.country}</td>
						<td>${r.team}</td>
						<td>${r.bike}</td>
						<td>${2020 - r.firstGPYear}</td>
						<td>${r.wins}</td>
						<td>${r.podiums}</td>
						<td>${r.poles}</td>
						<td>${r.raceFastestLaps}</td>
						<td>${r.championships}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</main>
<jsp:include page="bootstrapFoot.jsp" />  <!-- XXX -->
</body>
</html>