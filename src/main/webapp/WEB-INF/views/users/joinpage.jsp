<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<head>
<link href="${pageContext.request.contextPath}/css/joinpage.css" rel="stylesheet">
</head>
<div class="wrap">
	<div class="join_inner">
		<div class="join_logo">
			<h2 class="logo">
				<a href="#"> 구해줘용</a>
			</h2>
			<h3>
				직장인을 위한<br />커리어 플랫폼, 구해줘용!
			</h3>
			<h4>
				커리어 성장과 행복을 위한 여정<br />지금 구해줘용에서 시작하세요.
			</h4>
		</div><!--.join_logo-->
		<div class="join">
			<form class="join_form">
				<div class="photo">
					<p>
						<img src="" class="input_img">
					</p>
				</div><!--photo-->
				<div class="img">
					<div class="plus">
						<label for="file" class="input_file">+ </label> <input type="file" id="file"
							onchange='readFile(this)'>
					</div>
					<div class="text">사진 추가하기</div>
				</div><!--img-->
				<div class="join_id">
					<div class="text">
						<p>아이디</p>
						<button id="btnUserIdSameCheck" type="button">중복체크</button>
					</div>
					<div class="input_id">
						<input id="userId" type="text" placeholder="아이디를 입력해주세요">
					</div>
				</div>
				<!--login_id-->
				<div class="join_password">
					<div class="text">
						<p>비밀번호</p>
					</div>
					<div class="input_password">
						<input id="userPassword" type="password" placeholder="비밀번호를 입력해주세요">
					</div>
				</div><!--join_password-->
				<div class="join_password_check">
					<div class="text">
						<p>비밀번호 확인</p>
					</div>
					<div class="input_password_check">
						<input id="userPasswordSame" type="password" placeholder="입력하신 비밀번호를 입력해주세요">
					</div>
				</div><!--join_password_check-->
				<div class="join_name_age">
					<div class="join_name">
						<div class="text">
							<p>성함</p>
						</div>
						<div class="input_join_name">
							<input id="userName" type="text" placeholder="성함을 입력해주세요">
						</div>
					</div>
					<div class="join_age">
						<div class="text">
							<p>나이</p>
						</div>
						<div class="select_join_age">
							<select id="age">
								<option>20</option>
								<option>21</option>
								<option>22</option>
							</select>
						</div>
					</div>
					<!--.join_age-->
				</div>
				<!--join_name_age-->
				<div class="join_number">
					<div class="text">
						<p>전화번호</p>
						<button type="button">인증체크</button>
					</div>
					<div class="select_join_number">
						<select>
							<option>010</option>
							<option>011</option>
							<option>016</option>
							<option>017</option>
							<option>019</option>
						</select> <input id="phoneNumber" type="text" placeholder="000"> <input id="phoneNumber" type="text" placeholder="000">
					</div>
				</div>
				<!--join_number-->
				<div class="join_email">
					<div class="text">
						<p>이메일</p>
						<button type="button">인증체크</button>
					</div>
					<input id="email" type="email" placeholder="이메일을 입력해주세요">
				</div>
				<!--.join_email-->
				<div class="join_button">
					<button id="btnJoin" type="button">회원가입하기</button>
				</div>
				<!--join_button-->
				<div class="join_text">
					걱정마세요! 여러분의 지원 활동은 SNS에 노출되지 않습니다. <br />회원가입시 개인정보 처리방침과 이용약관을 확인하였으며, 동의합니다.
				</div>
			</form>
		</div>
		<!--join-->
	</div>
</div>
<script src="/js/users.js"></script>
<%@ include file="../layout/footer.jsp"%>