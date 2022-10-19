<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<head>
<link href="${pageContext.request.contextPath}/css/as_profile.css"
	rel="stylesheet">
</head>
<div id="wrap">
	<div id="as_wrap">
		<div class="as_menu">
			<p class="as_title">계정설정</p>
			<ul>
				<li class="as_proposal"><a href="/users/as/${principal.id}">기본정보
						수정</a></li>
				<li class="as_position"><a href="/users/profile">프로필 수정</a></li>
				<li class="as_proposal"><a
					href="/users/password/${principal.id}">비밀번호 설정</a></li>
				<li class="as_proposal"><a href="/users/delete/${principal.id}">회원 탈퇴</a></li>
			</ul>
		</div>
		<!--as_menu-->
		<div class="as_edit">
			<div>
				<strong>프로필 수정</strong>
			</div>
			<div class="as_detail">
				<div class="as_detail_position">
					<h6>포지션</h6>
					<div class="position">
						<select>
							<option>프론트엔드 개발자</option>
							<option>웹 퍼블리셔</option>
							<option>백엔드 개발자</option>
						</select>
					</div>
				</div>
				<!--as_detail_position-->
				<div class="as_detail_skill">
					<h6>스킬</h6>
					<div class="skill">
						<select>
							<option>Java</option>
							<option>JavaScript</option>
							<option>Spring</option>
						</select>
					</div>
				</div>
				<!--as_detail_skill-->
				<div class="as_detail_career">
					<h6>경력</h6>
					<div class="career">
						<select>
							<option>신입</option>
							<option>1년</option>
							<option>2년</option>
						</select>
					</div>
				</div>
				<!--as_detail_career-->
				<div class="as_detail_company">
					<h6>회사이름</h6>
					<div class="company">
						<select>
							<option>노마드랩</option>
							<option>네이버</option>
							<option>쿠팡</option>
						</select>
					</div>
				</div>
				<!--as_detail_company-->
				<div class="as_detail_education">
					<h6>학력</h6>
					<div class="company">
						<select>
							<option>yyyy-mm-dd</option>
							<option>yyyy-mm-dd</option>
							<option>yyyy-mm-dd</option>
						</select>
					</div>
				</div>
				<!--as_detail_education-->
				<div class="as_detail_text">
					<h6>간단 소개글</h6>
					<p>직무 내용, 경험, 목표 등을 추가해서 더욱 멋진 소개글을 작성해보세요.</p>
					<form>
						<p>
							<textarea>
							</textarea>
						</p>
					</form>
				</div>
			</div>
			<!--as_detail-->
			<div class="as_button">
				<button type="button">완료</button>
			</div>
			<!--as_button-->
		</div>
		<!--.as_edit-->
	</div>
	<!--.as_wrap-->
</div>
<%@ include file="../layout/footer.jsp"%>