<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<head>
<link href="${pageContext.request.contextPath}/css/as_delete.css"
	rel="stylesheet">
</head>
<div id="wrap">
	<div id="as_wrap">
		<div class="as_menu">
			<p class="as_title">계정설정</p>
			<ul>
				<li class="as_proposal"><a href="/users/as/${principal.id}">기본정보
						수정</a></li>
				<li class="as_proposal"><a href="/users/profile">프로필 수정</a></li>
				<li class="as_proposal"><a
					href="/users/password/${principal.id}">비밀번호 설정</a></li>
				<li class="as_position"><a href="/users/delete/${principal.id}">회원
						탈퇴</a></li>
			</ul>
		</div>
		<!--as_menu-->
		<div class="as_edit">
			<input id="id" type="hidden" value="${users.id}" />
			<div>
				<strong>회원 탈퇴 시 주의 사항</strong>
			</div>
			<div class="as_delete">
				<ul>
					<li>탈퇴 시 회원님의 이력서를 포함하여 회원님의 계정에 저장된 모든 정보가 영구적으로 삭제되며, 다시는
						복구할 수 없습니다.</li>
					<li>제출된 추천서의 수정이나 삭제를 원하실 경우, 탈퇴 이전에 추천 페이지에서 추천서를 수정, 또는 삭제
						해주세요.</li>
					<li>기업에 대한 채용 수수료 정산과 부정이용 방지를 위해, 기업에 대한 지원 내역은 관련 법령에 의거하여
						탈퇴 후 최장 5년간 저장됩니다.</li>
					<li>구해줘용 회원에서 탈퇴하실 경우, 추천 및 채용 보상금을 받으실 수 없습니다. 받으실 보상금이 있으시다면
						탈퇴 이전에 모든 수속을 마쳐주세요.</li>
					<li>기업 서비스에 등록되어 있는 계정일 경우, 기업 서비스 접속권한도 동시에 삭제됩니다.</li>
					<li>이상의 내용에 동의하여 탈퇴를 원하실 경우, 아래의 “동의하기” 버튼을 클릭 부탁드립니다.</li>
				</ul>
			</div>
			<!--as_delete-->
			<div class="as_button">
				<button id="btnDelete" type="button">동의하기</button>
			</div>
			<!--as_button-->
		</div>
		<!--.as_edit-->
	</div>
	<!--.as_wrap-->
</div>
<script>
$("#btnDelete").click(() => {
	  deleteById();
	});

function deleteById(){
	let id= $("#id").val();

	  $.ajax("/api/users/delete/" + id, {
			type: "DELETE",
			dataType: "json"
		}).done((res) => {
			if (res.code == 1) {
				alert("회원탈퇴 성공했습니다.");
				location.href = "/loginpage"; 
			} else {
				alert("회원탈퇴에 실패했습니다.");
			}
		});
	}
</script>
<%@ include file="../layout/footer.jsp"%>