<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="../layout/header.jsp"%>

<!DOCTYPE html>
<html lang="ko">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="/css/likes.css" rel="stylesheet">

</head>
<body>
	<input id="id" type="hidden" value="{likesListstate.id}">

	<div class="container">

		<!-- 공고진행중 -->
		<div class="photosetting">
			<div class="liketitle">좋아요</div>

			<!-- for each 반목되는 기준이 되는  -->

			<c:forEach var="likes" items="${likesList}">
				<div class="replay_box">
					<div class="full_setting">
						<div class="photocompany">
							<!-- <img src="/img/${resume.resumePhoto}" class="img-thumbnail"/>-->
							<!--  ${likes.photo} 이미지 들어오면 src자리에 넣기-->
							<a href="/"><img class="companyphoto" src='https://picsum.photos/250/250' alt="회사이미지"></a>
						</div>
						<div class="company_story">
							<div class="contect_title">${likes.title}</div>
							<div class="explanation">
								<div class="explanation_text">${likes.detail}</div>
							</div>

							<div class="company_image">
								<div class="test">
									<a href="/"><img class="conpany_min_iphoto" src='https://picsum.photos/250/250'
										alt="회사이미지" width="25" height="25">${likes.photo}</a> <a class="test2">${likes.companyName}</a>
								</div>
							</div>
							<div class="${likes.state=='마감' ? 'like_deadline': 'like_proceeding'}">${likes.state}</div>


						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
	<!-- photosetting-->


	<!--container-->
</body>

</html>
<%@ include file="../layout/footer.jsp"%>