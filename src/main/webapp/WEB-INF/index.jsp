<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>팀 모집 게시판</title>
		<link href="resources/bootstrap/bootstrap.min.css" rel="stylesheet" >
			<style>
			</style>
		<script src="resources/js/jquery-3.2.1.min.js"></script>
		<script src="resources/js/formcheck.js"></script>
		</head>
		
		<body>
			<div class="container">
				<%@ include file="template/header.jsp" %>
					<jsp:include page="${ param.body }" />
				<%@ include file="template/footer.jsp" %>
			</div>
			<script src="resources/bootstrap/bootstrap.bundle.min.js"></script>
		</body>
</html>