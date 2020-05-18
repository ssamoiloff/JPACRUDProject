<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Rider</title>
<jsp:include page="bootstrapHead.jsp" />
</head>
<body>
	<jsp:include page="navbar.jsp" />

	<form action="submitEdit.do" method="POST">
		<div>
			<input type="hidden" name="id" id="id" value="${rider.id}" /><br>
			<br>
		</div>
		<div class="form-group">
			<label for="riderNumber">Race Number</label><br> <input
				type="text" name="riderNumber" id="riderNumber"
				value="${rider.riderNumber}" /><br>
			<br>
		</div>
		<div class="form-group">
			<label for="firstName">First Name</label><br> <input type="text"
				name="firstName" id="firstName" value="${rider.firstName}" required /><br>
			<br>
		</div>
		<div class="form-group">
			<label for="lastName">Last Name</label><br> <input type="text"
				name="lastName" id="lastName" value="${rider.lastName}" required /><br>
			<br>
		</div>
		<div class="form-group">
			<label for="age">Age</label><br> <input type="text" name="age"
				id="age" value="${rider.age}" /><br>
			<br>
		</div>
		<div class="form-group">
			<label for="country">Country</label><br> <input type="text"
				name="country" id="country" value="${rider.country}" /><br>
			<br>
		</div>
		<div class="form-group">
			<label for="team">Team</label><br> <input type="text"
				name="team" id="team" value="${rider.team}" /><br>
			<br>
		</div>
		<div class="form-group">
			<label for="bike">Bike</label><br> <input type="text"
				name="bike" id="bike" value="${rider.bike}" /><br>
			<br>
		</div>
		<div class="form-group">
			<label for="firstGPYear">First GP Year</label><br> <input
				type="text" name="firstGPYear" id="firstGPYear"
				value="${rider.firstGPYear}" /><br>
			<br>
		</div>
		<div class="form-group">
			<label for="wins">Wins</label><br> <input type="text"
				name="wins" id="wins" value="${rider.wins}" /><br>
			<br>
		</div>
		<div class="form-group">
			<label for="podiums">Podiums</label><br> <input type="text"
				name="podiums" id="podiums" value="${rider.podiums}" /><br>
			<br>
		</div>
		<div class="form-group">
			<label for="poles">Pole Positions</label><br> <input type="text"
				name="poles" id="poles" value="${rider.poles}" /><br>
			<br>
		</div>
		<div class="form-group">
			<label for="raceFastestLaps"># of Race Fastest Laps</label><br>
			<input type="text" name="raceFastestLaps" id="raceFastestLaps"
				value="${rider.raceFastestLaps}" /><br>
			<br>
		</div>
		<div class="form-group">
			<label for="championships">Championships</label><br> <input
				type="text" name="championships" id="championships"
				value="${rider.championships}" /><br>
			<br>
		</div>

		<div class="btn-block">
				<button type="submit">Submit</button>
			</div>
	</form>

	<jsp:include page="bootstrapFoot.jsp" />
</body>
</html>