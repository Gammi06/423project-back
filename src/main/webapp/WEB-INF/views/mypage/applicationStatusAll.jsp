<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

    <%@ include file="../layout/header.jsp" %>

        <head>
            <link href="/css/application_status_all.css" rel="stylesheet">
            <script src="https://kit.fontawesome.com/e264982194.js" crossorigin="anonymous"></script>
        </head>
        <div id="wrap">
            <div id="asa_wrap">
                <div class="asa_menu">
                    <p class="asa_title">지원 현황</p>
                    <ul>
                        <li class="asa_position"><a href="/applicationstatusall">지원한 포지션</a></li>
                        <li class="asa_proposal"><a href="/proposal">받은 요청</a></li>
                    </ul>
                </div>

                <div class="asa_contents">
                    <div class="asa_counts">
                        <div class="asa_count_all">
                            <a href="/applicationstatusall">
                                <p class="asa_all_count">99</p>
                                <p class="asa_all_text">전체</p>
                            </a>
                        </div>
                        <div class="asa_count_c">
                            <a href="/applicationstatus">
                                <p class="asa_count">99</p>
                                <p class="asa_text">지원 완료</p>
                            </a>
                        </div>
                        <div class="asa_count_final">
                            <a href="/applicationstatusfinal">
                                <p class="asa_final_count">99</p>
                                <p class="asa_final_text">최종합격</p>
                            </a>
                        </div>
                    </div>

                    <div class="asa_search">
                        <form>
                            <input type="text" placeholder="회사명 검색">
                            <button class="btn_search" type="submit"></button>
                        </form>
                    </div>


                    <div>
                        <table class="asa_table">
                            <thead>
                                <tr>
                                    <th>지원 회사</th>
                                    <th>지원 포지션</th>
                                    <th>작성 시간</th>
                                    <th>진행 상태</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="applicationStatusList" items="${applicationStatusList}">
                                    <tr>
                                        <td>${applicationStatusList.companyName}</td>
                                        <td>${applicationStatusList.positionCodeName}</td>
                                        <td>${applicationStatusList.created}</td>
                                        <td>
                                            <c:choose>
                                                <c:when test="${applicationStatusList.state == 0}">
                                                    <p class="waiting">대기중</p>
                                                </c:when>
                                                <c:when test="${applicationStatusList.state == 1}">
                                                    <p class="pass">합격</p>
                                                </c:when>
                                                <c:when test="${applicationStatusList.state == 2}">
                                                    <p class="fail">불합격</p>
                                                </c:when>
                                                <c:otherwise>
                                                    <p class="waiting">대기중</p>
                                                </c:otherwise>
                                            </c:choose>
                                        </td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>

        <%@ include file="../layout/footer.jsp" %>