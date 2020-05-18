<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Rider</title>
<jsp:include page="bootstrapHead.jsp" />
<link href="css/style.css" type="text/css" rel="stylesheet">
</head>
<body>
	<jsp:include page="navbar.jsp" />
	<div class="create-form">
		<form action="addRider.do" method="POST">
			<div class="banner">
				<h2>Create Your MotoGP Rider</h2>
			</div>
			<div class="columns">
				<div class="item">
					<label for="rNum">Race Number</label> <input id="rNum" type="text"
						name="riderNumber" />
				</div>
				<div class="item">
					<label for="fname">First Name<span>*</span></label> <input id="fname" type="text"
						name="firstName" required />
				</div>
				<div class="item">
					<label for="lname">Last Name<span>*</span></label> <input id="lname" type="text"
						name="lastName" required />
				</div>
				<div class="item">
					<label for="age">Age</label> <input id="age" type="text"
						name="age" />
				</div>
				<div class="item">
					<label for="country">Country</label> <input id="country" type="text"
						name="country" />
				</div>
				<div class="item">
					<label for="team">Team</label> <input id="team" type="text"
						name="team" />
				</div>
				<div class="item">
					<label for="bike">Bike</label> <input id="bike" type="text"
						name="bike" />
				</div>
				<div class="item">
					<label for="fGPYear">Rookie Year</label> <input id="fGPYear" type="text"
						name="firstGPYear" />
				</div>
				<div class="item">
					<label for="wins">Wins</label> <input id="wins" type="text"
						name="wins" />
				</div>
				<div class="item">
					<label for="podiums">Podiums</label> <input id="podiums" type="text"
						name="podiums" />
				</div>
				<div class="item">
					<label for="poles">Pole Positions</label> <input id="poles" type="text"
						name="poles" />
				</div>
				<div class="item">
					<label for="rFLaps"># of Fastest Laps</label> <input id="rFLaps" type="text"
						name="raceFastestLaps" />
				</div>
				<div class="item">
					<label for="champs">Championships</label> <input id="champs" type="text"
						name="championships" />
				</div>
			</div>
			<div class="btn-block">
				<button type="submit">Create</button>
			</div>
		</form>
	</div>

	<jsp:include page="bootstrapFoot.jsp" />
</body>
</html>