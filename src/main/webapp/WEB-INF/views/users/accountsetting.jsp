<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<head>
<link href="${pageContext.request.contextPath}/css/accountsetting.css"
	rel="stylesheet">
</head>
<div id="wrap">
	<div id="as_wrap">
		<div class="as_menu">
			<p class="as_title">계정설정</p>
			<ul>
				<li class="as_position"><a href="/users/as/${principal.id}">기본정보
						수정</a></li>
				<li class="as_proposal"><a href="#">프로필 수정</a></li>
				<li class="as_proposal"><a href="#">비밀번호 설정</a></li>
				<li class="as_proposal"><a href="#">회원 탈퇴</a></li>
			</ul>
		</div>
		<!--as_menu-->
		<div class="as_edit">
			<form>
				<input id="id" type="hidden" value="${users.id}" />
				<div>
					<strong>기본정보 수정</strong>
				</div>
				<div>
					<span>지원 결과 또는 추천 포지션 정보를 받아볼 이메일/연락처 정보 입력해주세요.</span>
				</div>
				<div class="as_img">
					<div class="photo">
						<img src="" class="input_img">
					</div>
					<!--photo-->
					<div class="img">
						<div class="plus">
							<label for="file" class="input_file">+ </label> <input
								type="file" id="file" onchange='readFile(this)'>
						</div>
						<div class="text">사진 변경하기</div>
					</div>
					<!--img-->
				</div>
				<!--as_img-->
				<div class="as_detail">
					<div class="as_detail_name">
						<h6>이름</h6>
						<input id="userName" type="text" class="input_userName"
							value="${users.userName}">
					</div>
					<div class="as_detail_email">
						<h6>이메일</h6>
						<input id="email" type="email" class="input_email"
							value="${users.email}">
					</div>
					<div class="as_detail_phone">
						<h6>전화번호</h6>
						<input id="phoneNumber" type="text" class="input_phone"
							value="${users.phoneNumber}">
					</div>
				</div>
				<!--as_detail-->
				<div class="as_button">
					<button id="btnUpdate" type="button">완료</button>
				</div>
			</form>
		</div>
		<!--.as_edit-->
	</div>
	<!--.as_wrap-->
</div>
<script>
$("#btnUpdate").click(() => {
	update();
});

function update() {
	let data = {
		userName: $("#userName").val(),
		email: $("#email").val(),
		phoneNumber: $("#phoneNumber").val()
	};

	let id = $("#id").val();

	$.ajax("/api/users/as/" + id, {
		type: "PUT",
		dataType: "json", 
		data: JSON.stringify(data), 
		headers: { 
			"Content-Type": "application/json; charset=utf-8"
		}
	}).done((res) => {
		if (res.code == 1) {
			alert("회원 수정 완료");
			location.reload(); // f5
		} else {
			alert("업데이트에 실패하였습니다");
		}
	});
}
</script>
<%@ include file="../layout/footer.jsp"%>