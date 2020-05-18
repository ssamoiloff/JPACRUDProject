<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<nav class="navbar">
	<ul>
	  <li><a href="home.do">Home</a></li>
	  <li><a href="gridPage.do">2020 MotoGP Grid</a></li>
	  <li><a href="createPage.do">Create Rider</a></li>
	  <li><a href="editSelectionPage.do">Edit Rider</a></li>
	  <li><a href="deletePage.do">Delete Rider</a></li>
	</ul>
	<div class="search-container">
	  <form action="navSearch.do">
		<input type="text" name="search" placeholder="Search rider id, name, number, and team" />
		<button type="submit">Search</button>
	</form>
	</div>
</nav>