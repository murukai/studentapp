<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Student Management - ${title}</title>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">


<!-- Custom styles for heroic-features template -->
<link href="${css}/heroic-features.css" rel="stylesheet">

<!-- Custom styles for one-page-wonder template -->
<link href="${css}/one-page-wonder.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/portfolio-item.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/student-table.css" rel="stylesheet">

<!-- Custom styles for modern business template -->
<link href="${css}/modern-business.css" rel="stylesheet">

<link href="${css}/round-about.css" rel="stylesheet">

<!-- Bootstrap cybog theme CSS -->
<link href="${css}/bootstrap-litera-theme.css" rel="stylesheet">

</head>

<body>

	<%@include file="./shared/nav-bar.jsp"%>
	<div class="container">
		<div class="row">

			<!-- Loading the home content -->
			<c:if test="${userClickHome == true }">
				<%@include file="home-side-bar.jsp"%>
				<%@include file="home.jsp"%>
			</c:if>

			<!-- Load only when user clicks about -->
			<c:if test="${userClickAbout == true }">
				<%@include file="about.jsp"%>
			</c:if>

			<!-- Load only when user clicks contact -->
			<c:if test="${userClickContact == true }">
				<%@include file="contactus.jsp"%>
			</c:if>
			
			<!-- Load only when user clicks contact -->
			<c:if test="${userClickDepartment == true }">
				<%@include file="departments.jsp"%>
			</c:if>
			
			<!-- Load only when user clicks contact -->
			<c:if test="${userClickSport == true }">
				<%@include file="sports.jsp"%>
			</c:if>
			
			<!-- Load only when user clicks contact -->
			<c:if test="${userClickStudent == true }">
				<%@include file="student.jsp"%>
			</c:if>
			
			<!-- Load only when user clicks contact -->
			<c:if test="${userClickLogin == true }">
				<%@include file="login.jsp"%>
			</c:if>
		</div>
	</div>
	<%@include file="./shared/footer.jsp"%>

	<!-- Bootstrap core JavaScript -->
	<script src="${js}/jquery.min.js"></script>
	<script src="${js}/bootstrap.bundle.min.js"></script>
	
	 <!-- Plugin JavaScript -->
    <script src="${js}/jquery.easing.min.js"></script>

    <!-- Contact form JavaScript -->
    <script src="${js}/jqBootstrapValidation.js"></script>
    <script src="${js}/contact_me.js"></script>
    
    <script src="${js}/student-single-page-datatable.js"></script>

    <!-- Custom scripts for this template -->
    <script src="${js}/agency.min.js"></script>

</body>

</html>
