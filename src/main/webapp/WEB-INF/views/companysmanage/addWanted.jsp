<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<head>
<link href="${pageContext.request.contextPath}/css/companypage_add_wanted.css" rel="stylesheet">
</head>

<div id="wrapper">
		<div id="cp_wrap">
			<div class="companypage">

				<p class="companypage_title">Company Page</p>

				<div class="cp_info">
					<div class="cp_account">
						<div class="cp_img"></div>
						<div class="cp_acc">
							<p class="name">이름</p>
							<p class="email">이메일</p>
						</div>
						<div class="cp_acc_setting">
							<button>
								<a href="#">계정 설정하기</a>
							</button>
						</div>
					</div>
					<div class="cp_menu">
						<select name="cp_option">
							<option value="지원자 관리">지원자 관리</option>
							<option value="채용중인 포지션" selected="selected">채용중인 포지션</option>
						</select>
					</div>
					<div class="cp_status">
						<ul>
							<li><a href="#">
									<div class="cp_status_li1"><span>채용관리</span></div>
								</a></li>
							<li><a href="companypage_company_detail.html">
									<div class="cp_status_li2"><span>회사정보</span></div>
								</a></li>
						</ul>
					</div>
				</div>

				<div class="logout">
					<button>
						<a href="#">로그아웃</a>
					</button>
				</div>
			</div>

			<div class="cp_contents">
				<div class="cp_applications">
					<form>
						<p class="cp_add">공고 추가하기</p>
						<div class="cp_wanted_title"><span>공고 제목</span>
							<input type="text" placeholder="공고 제목을 작성해주세요.">
						</div>
						<div class="cp_wanted_discribe">
							<span>설명글</span>
							<textarea placeholder="설명"></textarea>
						</div>
						<div class="cp_wanted_position">
							<span>직군/직무</span>
							<select name="wanted_position">
								<option value="#">직군/직무를 선택해주세요</option>
							</select>
							<p>포지션이 다른 경우 하나씩 추가해야 합니다. <br>
								(예: iOS개발자, Android개발자 2개의 포지션을 채용해야 하는 경우, 2번 따로 작성)
							</p>
						</div>
						<div class="cp_wanted_career">
							<span>경력</span>
							<p>인턴은 작성 불가</p>
							<input type="radio" name="position" value="신입" checked="checked"><span
								class="text">신입&nbsp&nbsp</span>
							<input type="radio" name="position" value="경력"><span class="text">경력&nbsp&nbsp&nbsp<select
									name="career">
									<option value="경력 선택">경력 선택</option>
								</select></span>
						</div>
						<div class="cp_wanted_pay">
							<span>채용 시 예상 연봉 (단위: 만 원)</span>
							<select name="wanted_pay">
								<option value="#">연봉 선택</option>
							</select>
						</div>
						<div class="cp_wanted_enddate">
							<span>마감일</span>
							<input type="date">
						</div>
						<div class="cp_contents_btn clearfix">
							<button type="companymanage/wantedAll" class="cp_contents_cancel">작성취소</button>
							<button type="submit" class="cp_contents_write">작성완료</button>
						</div>
					</form>
				</div>
			</div>
		</div>

<%@ include file="../layout/footer.jsp"%>