<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<head>
<link href="${pageContext.request.contextPath}/css/companypage_company_detail.css" rel="stylesheet">
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
							<li><a href="companysmanage/wantedAll">
									<div class="cp_status_li1"><span>채용관리</span></div>
								</a></li>
							<li><a href="companysmanage/companyDetail">
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
						<p>회사 정보</p>
						<span>대표이미지</span>
						<div class="cp_img">
							<div class="img">이미지</div>
							<div class="add_img">
								<label for="add_img">
									<svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink"
										viewBox="0 0 32 32" data-svg-content="true">
										<g>
											<path
												d="M 17,2C 8.716,2, 2,8.716, 2,17S 8.716,32, 17,32S 32,25.284, 32,17S 25.284,2, 17,2z M 25,18L 18,18 l0,7 C 18,25.552, 17.552,26, 17,26S 16,25.552, 16,25L 16,18 L 9,18 C 8.448,18, 8,17.552, 8,17C 8,16.448, 8.448,16, 9,16L 16,16 L 16,9 C 16,8.448, 16.448,8, 17,8 S 18,8.448, 18,9L 18,16 l 7,0 C 25.552,16, 26,16.448, 26,17C 26,17.552, 25.552,18, 25,18z">
											</path>
										</g>
									</svg>
									<p>사진 추가하기</p>
								</label>
								<span>?MB 이상 업로드 불가</span>
								<div class="input"><input type="file" id="add_img" name="add_img" accept="image/*"
										onchange="loadFile(this)"></div>
							</div>
						</div>
						<div class="cp_discribe"><span>회사소개</span><textarea placeholder="회사 소개를 입력해주세요."></textarea>
						</div>
						<button type="submit" class="cp_contents_write">작성완료</button>
					</form>
				</div>
			</div>
		</div>

<%@ include file="../layout/footer.jsp"%>