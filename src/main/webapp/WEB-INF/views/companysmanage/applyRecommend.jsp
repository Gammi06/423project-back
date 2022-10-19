<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<head>
<link href="${pageContext.request.contextPath}/css/companypage_recommend.css" rel="stylesheet">
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
                            <option value="지원자 관리" selected="selected">지원자 관리</option>
                            <option value="채용중인 포지션">채용중인 포지션</option>
                        </select>
                    </div>
                    <div class="cp_status">
                        <ul>
                            <li><a href="companysmanage/applyManage">
                                    <div class="cp_status_li1"><span>지원자 관리</span></div>
                                </a></li>
                            <li><a href="companysmanage/applyRecommend">
                                    <div class="cp_status_li2"><span>지원자 추천</span></div>
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
                    <div class="cp_search">
                        <div class="cp_recommends_title">
                            <p>지원자 추천</p><span>현재 구직중인 이력서 목록입니다.</span>
                        </div>
                        <div class="cp_position">
                            <select name="cp_position">
                                <option value="#" selected="selected">포지션</option>
                            </select>
                        </div>
                    </div>
                    <div>
                        <table class="cp_table">
                            <thead>
                                <tr>
                                    <th class="cp_table_title">이력서 제목</th>
                                    <th></th>
                                    <th>작성자 이름</th>
                                    <th>일자</th>
                                    <th></th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td class="cp_table_title">이력서 제목</td>
                                    <td><a href="#">바로가기</a></td>
                                    <td>이름</td>
                                    <td>yyyy.mm.dd</td>
                                    <td><a href="#">제안하기</a></td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>

<%@ include file="../layout/footer.jsp"%>