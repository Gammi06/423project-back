<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="../layout/header.jsp"%>

<!DOCTYPE html>
<html lang="ko">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="/css/subscribes.css" rel="stylesheet">
</head>
<body>

	<div class="container">

		<div class="graph">구독</div>
		<table>

			<thead class="company_header">
				<tr>
					<th>회사명</th>
					<th>현재 올라온 공고</th>
					<th>일자</th>
					<th>상태</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach var="subscribesRespListDto" items="${subcribesList}">
					<tr class="company_body" onclick="location.href='/'" style="cursor: pointer">
						<td><a href="/">${subscribesRespListDto.companyName}</a></td>
						<td><a href="/">${subscribesRespListDto.companyName}</a></td>
						<td>${subscribesRespListDto.created}</td>
						<td>
						<c:choose>
								<c:when test="${subscribesRespListDto.state == '모집중'}">
									<p class="next_company">모집중</p>
								</c:when>
								<c:when test="${subscribesRespListDto.state == '마감'}">
									<p class="out_company">마감</p>
								</c:when>
						</c:choose>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<!--container-->
</body>

</html>
<%@ include file="../layout/footer.jsp"%>
