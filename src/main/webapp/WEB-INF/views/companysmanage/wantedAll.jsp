<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<head>
<link href="${pageContext.request.contextPath}/css/companypage_recruit_manage.css" rel="stylesheet">
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
					<a href="#" class="cp_apply_manage">
						<div class="cp_apply_text">
							<p>지원자 관리 바로가기</p>
							<span>열람/제안/수락한 지원자들을 한 눈에 볼 수 있습니다.</span>
						</div>
						<div class="cp_arrow">
							>
						</div>
					</a>
					<div class="cp_search">
						<a href="companypage_add_wanted.html" class="subtitle_btn">
							공고추가
						</a>

						<div class="cp_select">
							<select name="text">
								<option value="#" selected="selected">신입/경력</option>
								<c:forEach var="careersCode" items="${wanteds}"><option value="${wanteds.careerCodeId}">${wanteds.careerName}</option></c:forEach>
							</select>
							<select name="text" class="select_position">
								<option value="#" selected="selected">포지션</option>
								<c:forEach var="positionCode" items="${wanteds}"><option value="${wanteds.positionCodeId}">${wanteds.positionName}</option></c:forEach>
							</select>
						</div>
					</div>

					<div class="cp_content_wrapper">
					<c:forEach var="wanteds" items="${wanteds}">
					<div class="cp_content_item">
							<div class="cp_item_top">
								<div class="cp_item_wanted">
									<a href="#" class="cp_wanted_link">
										<p class="wanted_title">${wanteds.title}</p>
										<p class="wanted_discribes">${wanteds.detail}</p>
									</a>
								</div>
								<div class="cp_item_state">${wanteds.state}</div>
							</div>
							<div class="cp_item_bot">
								<a href="#" class="cp_wanted_modify">수정하기</a>
							</div>
						</div>
					</c:forEach>
					</div>
				</div>
			</div>
		</div>

<%@ include file="../layout/footer.jsp"%>