<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Deleted Rider Details</title>
<jsp:include page="bootstrapHead.jsp" />
</head>
<body>
	<jsp:include page="navbar.jsp" />

	<c:if test="${not empty riders}">
		<c:choose>
			<c:when test="${gto == false}">
				<div class="alert alert-success" role="alert">Rider	successfully deleted!</div>
			</c:when>
			<c:otherwise>
				<div class="alert alert-success" role="alert">Riders successfully deleted!</div>
			</c:otherwise>
		</c:choose>
	</c:if>
	<c:if test="${empty riders}">
		<div class="alert alert-danger" role="alert">Riders could not be deleted!</div>
	</c:if>

	<main class="container-fluid">
		<h2>Deleted Riders:</h2>
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
						<td>${r.firstName}${r.lastName}</td>
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
	<jsp:include page="bootstrapFoot.jsp" />
</body>
</html>