<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ page import="java.util.*"%>
<%@ page import="com.model.Article"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Medium Clone</title>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<style>
.custom-navbar {
	background-color: #f8f9fa;
	padding: 10px;
}

.article-title {
	font-size: 1.25rem; /* Reduced font size */
	font-weight: bold;
}

.article-meta {
	font-size: 0.8rem; /* Reduced font size */
	color: gray;
}

.article-content {
	margin-top: 20px;
}

.truncate {
	display: -webkit-box;
	-webkit-box-orient: vertical;
	-webkit-line-clamp: 3;
	overflow: hidden;
	text-overflow: ellipsis;
	padding-right: 1rem;
}

.main-content {
	padding-top: 20px;
}

.post-meta {
	margin-top: 10px;
}

.square-image {
	width: 70%; /* Reduced size */
	height: 90%;
	aspect-ratio: 1/1; /* Ensures the image is square */
	object-fit: cover; /* Ensures the image covers the entire area */
}

.profile-image {
	width: 25px; /* Reduced size */
	height: 25px; /* Reduced size */
	border-radius: 50%;
	object-fit: cover;
	margin-right: 10px;
}

.top-right-profile {
	width: 25px; /* Reduced size */
	height: 25px; /* Reduced size */
	border-radius: 50%;
	object-fit: cover;
	margin-left: 10px;
}
</style>
</head>
<body>

	<div class="custom-navbar">
		<div class="container">
			<nav class="navbar navbar-expand-lg navbar-light">
				<a class="navbar-brand" href="#"><img
					src="https://cdn-icons-png.flaticon.com/512/732/732223.png"
					alt="Medium Logo" width="30"></a>
				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#navbarNav" aria-controls="navbarNav"
					aria-expanded="false" aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarNav">
					<ul class="navbar-nav">
						<li class="nav-item active"><a class="nav-link" href="#">For
								you</a></li>
						<li class="nav-item"><a class="nav-link" href="#">Following</a>
						</li>
						<li class="nav-item"><a class="nav-link" href="#">Coding</a>
						</li>
						<li class="nav-item"><a class="nav-link" href="#">Software
								Development</a></li>
						<li class="nav-item"><a class="nav-link" href="#">Technology</a>
						</li>
						<li class="nav-item"><a class="nav-link" href="#">Programming</a>
						</li>
					</ul>
				</div>
				<div class="user-menu">
					<a href="write"><button class="btn btn-primary">Write</button></a>
					<span class="notification-icon">🔔</span> <img
						src="https://via.placeholder.com/30" class="top-right-profile"
						alt="User">
				</div>
			</nav>
		</div>
	</div>

	<div class="container">
		<main class="main-content">
			<section class="article-content">
				<%
                List<Article> articles = (List<Article>) request.getAttribute("articles");
                if (articles != null && !articles.isEmpty()) {
                %>
				<s:iterator value="articles" var="article">
					<article class="post mb-4 p-4 border rounded">
						<div class="row">
							<div class="col-md-9">
								<div class="post-header d-flex align-items-center">
									<img src="<s:property value="#article.profileImageUrl"/>"
										alt="Profile Image" class="profile-image"> <span
										class="article-meta"><s:property value="#article.name" /></span>
									in <span class="article-meta" style="color: blue;"><s:property
											value="#article.uploadedDate" /></span>
								</div>
								<h2 class="article-title mt-2">
									<s:property value="#article.title" />
								</h2>
								<p class="truncate mt-3">
									<s:property value="#article.content" />
								</p>
								<div class="post-meta">
									<span class="badge badge-secondary">AI</span>
								</div>
							</div>
							<div class="col-md-3 text-center">
								<img src="<s:property value="#article.imageURl"/>" alt="logo1"
									class="square-image">
							</div>
						</div>
					</article>
				</s:iterator>
				                
     				<%
                    } 
                     %>
               
			

			</section>
		</main>
	</div>

	<footer>
		<!-- Footer content -->
	</footer>

	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
