<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<nav class="navbar">
	<table class="navbar-nav">
		<tr>
	  <th class="nav-item"><a class="nav-link" href="home.do">Home</a></th>
	  <th class="nav-item"><a class="nav-link" href="gridPage.do">2020 MotoGP Grid</a></th>
	  <th class="nav-item"><a class="nav-link" href="createPage.do">Create Rider</a></th>
	  <th class="nav-item"><a class="nav-link" href="editPage.do">Edit Rider Details</a></th>
	  <th class="nav-item"><a class="nav-link" href="deletePage.do">Delete Rider</a></th>
		</tr>
	</table>
	<div class="search-container">
	  <form action="navSearch.do">
		<input type="text" name="search" placeholder="Search" />
		<button type="submit">Submit</button>
	</form>
	</div>
</nav>