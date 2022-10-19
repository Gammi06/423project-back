<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
	<%@ include file="../layout/header.jsp" %>

		<head>
			<link href="${pageContext.request.contextPath}/css/loginpage.css" rel="stylesheet">
		</head>
		<div class="wrap">
			<div class="login_logo">
				<h2 class="logo">
					<a href="/"> 구해줘용</a>
				</h2>
				<h3>
					직장인을 위한<br />커리어 플랫폼, 구해줘용!
				</h3>
				<h4>
					커리어 성장과 행복을 위한 여정<br />지금 구해줘용에서 시작하세요.
				</h4>
			</div>
			<!--login_logo-->
			<div class="login_detail">
				<form class="login_form">
					<div class="login_id">
						<div class="text">
							<p>아이디</p>
						</div>
						<div class="input_id">
							<input id="userId" type="text" placeholder="아이디를 입력해주세요" class="input_text">
						</div>
					</div>
					<!--login_id-->
					<div class="login_password">
						<div class="text">
							<p>비밀번호</p>
						</div>
						<div class="input_password">
							<input id="userPassword" type="password" placeholder="비밀번호를 입력해주세요" class="input_text">
						</div>
					</div>
					<!--login_password-->
					<div class="login_id_remember">
						<input id="remember" type="checkbox">
						<p class="input_text">아이디를 기억합니다.</p>
					</div>
					<!--login_id_remembe-->
					<div class="button_button">
						<button id="btnLogin" class="login_button" type="button">로그인</button>
						<button class="join_button" type="button">
							<a href="/joinForm">회원가입</a>
						</button>
					</div>
					<!--button_button-->
					<div class="login_text">
						걱정마세요! 여러분의 지원 활동은 SNS에 노출되지 않습니다.<br />회원가입시 개인정보 처리방침과 이용약관을
						확인하였으며, 동의합니다.
					</div>
					<!--.login_text-->
				</form>
			</div>
			<!--.login_detail-->
		</div>
		<script>
			function login() {
				let data = {
					userId: $("#userId").val(),
					userPassword: $("#userPassword").val(),
					remember: $("#remember").prop("checked")
				};
				$.ajax("/api/login", {
					type: "POST",
					dataType: "json", // 응답 데이터
					data: JSON.stringify(data), // http body에 들고갈 요청 데이터
					headers: { // http header에 들고갈 요청 데이터
						"Content-Type": "application/json; charset=utf-8"
					}
				}).done((res) => {
					if (res.code == 1) {
						alert("로그인성공");
						setTimeout(function () {
							sendFirstAlarm();
						}, 2000);
					} else {
						alert("로그인 실패, 아이디 패스워드를 확인해주세요");
					}
				});
			}
		</script>
		<%@ include file="../layout/footer.jsp" %>
=======
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<head>
<link href="${pageContext.request.contextPath}/css/loginpage.css"
	rel="stylesheet">
</head>
<div class="wrap">
	<div class="login_logo">
		<h2 class="logo">
			<a href="/"> 구해줘용</a>
		</h2>
		<h3>
			직장인을 위한<br />커리어 플랫폼, 구해줘용!
		</h3>
		<h4>
			커리어 성장과 행복을 위한 여정<br />지금 구해줘용에서 시작하세요.
		</h4>
	</div>
	<!--login_logo-->
	<div class="login_detail">
		<form class="login_form">
			<div class="login_id">
				<div class="text">
					<p>아이디</p>
				</div>
				<div class="input_id">
					<input id="userId" type="text" placeholder="아이디를 입력해주세요"
						class="input_text">
				</div>
			</div>
			<!--login_id-->
			<div class="login_password">
				<div class="text">
					<p>비밀번호</p>
				</div>
				<div class="input_password">
					<input id="userPassword" type="password" placeholder="비밀번호를 입력해주세요"
						class="input_text">
				</div>
			</div>
			<!--login_password-->
			<div class="login_id_remember">
				<input id="remember" type="checkbox">
				<p class="input_text">아이디를 기억합니다.</p>
			</div>
			<!--login_id_remembe-->
			<div class="button_button">
				<button id="btnLogin" class="login_button" type="button">로그인</button>
				<button class="join_button" type="button">
					<a href="/joinForm">회원가입</a>
				</button>
			</div>
			<!--button_button-->
			<div class="login_text">
				걱정마세요! 여러분의 지원 활동은 SNS에 노출되지 않습니다.<br />회원가입시 개인정보 처리방침과 이용약관을
				확인하였으며, 동의합니다.
			</div>
			<!--.login_text-->
		</form>
	</div>
	<!--.login_detail-->
</div>
<script>
$("#btnLogin").click(() => {
	login();
});

function login() {
	let data = {
		userId: $("#userId").val(),
		userPassword: $("#userPassword").val(),
		remember: $("#remember").prop("checked")
	};
	$.ajax("/api/login", {
		type: "POST",
		dataType: "json", // 응답 데이터
		data: JSON.stringify(data), // http body에 들고갈 요청 데이터
		headers: { // http header에 들고갈 요청 데이터
			"Content-Type": "application/json; charset=utf-8"
		}
	}).done((res) => {
		if (res.code == 1) {
			alert("로그인성공");
			location.reload();
		} else {
			alert("로그인 실패, 아이디 패스워드를 확인해주세요");
		}
	});
}
</script>
<%@ include file="../layout/footer.jsp"%>
>>>>>>> acfe4c39b33a2e1c9354bac79e0f2ea303b1caee
