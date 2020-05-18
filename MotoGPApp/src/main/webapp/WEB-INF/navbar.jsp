<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<nav class="navbar">
	<table class="navbar-nav">
		<tr>
	  <td class="nav-item"><a class="nav-link" href="home.do">Home</a></td>
	  <td class="nav-item"><a class="nav-link" href="gridPage.do">2020 MotoGP Grid</a></td>
	  <td class="nav-item"><a class="nav-link" href="createPage.do">Create Rider</a></td>
	  <td class="nav-item"><a class="nav-link" href="editSelectionPage.do">Edit Rider Details</a></td>
	  <td class="nav-item"><a class="nav-link" href="deletePage.do">Delete Rider</a></td>
		</tr>
	</table>
	<div class="search-container">
	  <form action="navSearch.do">
		<input type="text" name="search" placeholder="Search rider id, name, number, and team" />
		<button type="submit">Search</button>
	</form>
	</div>
</nav>