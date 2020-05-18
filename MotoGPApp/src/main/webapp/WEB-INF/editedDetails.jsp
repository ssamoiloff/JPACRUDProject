<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edited Rider Details</title>
<jsp:include page="bootstrapHead.jsp" />
</head>
<body>
	<jsp:include page="navbar.jsp" />

	<c:if test="${not empty rider}">
	<div class="alert alert-success" role="alert">Rider successfully updated!</div>
	</c:if>
	<c:if test="${empty rider}">
	<div class="alert alert-danger" role="alert">Rider could not be updated!</div>
	</c:if>

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
				<tr>
					<td>${rider.riderNumber}</td>
					<td>${rider.firstName} ${rider.lastName}</td>
					<td>${rider.age}</td>
					<td>${rider.country}</td>
					<td>${rider.team}</td>
					<td>${rider.bike}</td>
					<td>${2020 - rider.firstGPYear}</td>
					<td>${rider.wins}</td>
					<td>${rider.podiums}</td>
					<td>${rider.poles}</td>
					<td>${rider.raceFastestLaps}</td>
					<td>${rider.championships}</td>
				</tr>
			</tbody>
		</table>
	</main>
	<jsp:include page="bootstrapFoot.jsp" />
</body>
</html>