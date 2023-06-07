<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- content -->
<div class="row">
	<!-- 캐러셀이미지 시작  -->
	<div class="row">
		<div id="carouselExampleIndicators" class="carousel slide" data-bs-ride="true">
		  <div class="carousel-indicators">
		    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
		    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
		    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
		  </div>
		  <div class="carousel-inner">
		    <div class="carousel-item active">
		      <img src="resources/main_img/dunk_event.jpg" class="d-block w-100" alt="...">
		    </div>
		    <div class="carousel-item">
		      <img src="..." class="d-block w-100" alt="...">
		    </div>
		    <div class="carousel-item">
		      <img src="..." class="d-block w-100" alt="...">
		    </div>
		  </div>
		  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
		    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
		    <span class="visually-hidden">Previous</span>
		  </button>
		  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
		    <span class="carousel-control-next-icon" aria-hidden="true"></span>
		    <span class="visually-hidden">Next</span>
		  </button>
		</div>
	</div>
	<div class="col">
		<div class="row">
			<div class="col">
				<h2 class="fs-3 fw-bold">매칭리스트</h2>
			</div>
		</div>
		<!-- 달력선택부분 -->
		<div class="row">
		
		</div>
		<div class="row">
			<div class="col">
				<a href="writeMatchingForm" class="btn">NEW 매칭글쓰기</a>
			</div>
		</div>
		<div class="row">
			<div class="col">
				<table class="table">
					<thead>
						<tr>
							<th>no</th>
							<th>매칭제목</th>
							<th>날짜</th>
							<th>조회수</th>
						</tr>
					</thead>
					<tbody>
						<c:if test="${not empty matchingList }">
							<c:forEach var="m" items="${matchingList}">
								<tr>
									<td>${m.no}</td>
									<td>${m.name}</td>
									<td>${m.date}</td>
									<td>${m.readCount}</td>
								</tr>
							</c:forEach>
						</c:if>
						<c:if test="${empty matchingList }">
							<tr>
								<td>게시글이 존재하지 않습니다!</td>
							</tr>
						</c:if>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>
