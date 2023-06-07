<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!-- content -->
<div class="row my-5" id="dunk-content">
	<div class="col">
		<div class="row text-center">
			<div class="col">
				<h2 class=" fw-bold fs-3">매칭리스트상세보기</h2>
			</div>
		</div>
		<div class="row my-3">
			<div class="col">
				<table class="table table-bordered">
					<tbody>					
						<tr>
							<th class="table-light">제 목</th>
							<td colspan="3">${ matching.name }</td>		
						</tr>
						<tr>
							<th class="table-light">글쓴이</th>
							<td>${ matching.userId }</td>
							<th class="table-light">매칭일</th>
							<td><fmt:formatDate value="${ matching.date }" pattern="yyyy-MM-dd HH:mm" /></td>		
						</tr>
						<tr>		
							<th class="table-light">비밀번호</th>
							<td>
								<div class="col-sm-8">
									<input class="form-control" type="password" name="pass" id="pass">
								</div>
							</td>
							<th class="table-light">조회수</th>
							<td>${ matching.readCount }</td>
						</tr>	
						<tr>		
							<td colspan="4">
								<pre>${ review.content }</pre>
							</td>
						</tr>	
					</tbody>
				</table>
			</div>
		</div>
		<div class="row my-3">
			<div class="col text-center">
				<input type="button" class="btn btn-warning" id="detailUpdate" value="수정하기">&nbsp;&nbsp;
				<input type="button" class="btn btn-danger" id="detailDelete" value="삭제하기">&nbsp;&nbsp;
			</div>
		</div>
	</div>
</div>	
	