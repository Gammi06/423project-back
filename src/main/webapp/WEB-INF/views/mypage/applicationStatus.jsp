<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

    <%@ include file="../layout/header.jsp" %>

        <head>
            <link href="/css/application_status.css" rel="stylesheet">
            <script src="https://kit.fontawesome.com/e264982194.js" crossorigin="anonymous"></script>
        </head>
        <div id="wrap">
            <div id="as_wrap">
                <div class="as_menu">
                    <p class="as_title">지원 현황</p>
                    <ul>
                        <li class="as_position"><a href="/applicationstatusall">지원한 포지션</a></li>
                        <li class="as_proposal"><a href="/proposal">받은 요청</a></li>
                    </ul>
                </div>

                <div class="as_contents">
                    <div class="as_counts">
                        <c:forEach var="statusCountDtos" items="${statusWaitingDto.statusCountDtos}">
                            <div class="as_count_all">
                                <a href="/applicationstatusall">
                                    <p class="as_all_count">${statusCountDtos.statusAll}</p>
                                    <p class="as_all_text">전체</p>
                                </a>
                            </div>
                            <div class="as_count_c">
                                <a href="/applicationstatus">
                                    <p class="as_count">${statusCountDtos.statusC}</p>
                                    <p class="as_text">지원 완료</p>
                                </a>
                            </div>
                            <div class="as_count_final">
                                <a href="/applicationstatusfinal">
                                    <p class="as_final_count">${statusCountDtos.statusFinal}</p>
                                    <p class="as_final_text">최종합격</p>
                                </a>
                            </div>
                        </c:forEach>
                    </div>

                    <div class="as_search">
                        <form method="get" action="/applicationstatus">
                            <input type="text" placeholder="회사명 검색" name="keyword">
                            <button class="btn_search" type="submit"></button>
                        </form>
                    </div>


                    <div>
                        <table class="as_table">
                            <thead>
                                <tr>
                                    <th>지원 회사</th>
                                    <th>지원 포지션</th>
                                    <th>작성 시간</th>
                                    <th>진행 상태</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="statusWaitingInfoDtos"
                                    items="${statusWaitingDto.statusWaitingInfoDtos}">
                                    <tr>
                                        <td><a href="#">${statusWaitingInfoDtos.companyName}</a></td>
                                        <td>${statusWaitingInfoDtos.positionCodeName}</td>
                                        <td>${statusWaitingInfoDtos.created}</td>
                                        <td>
                                            <p class="waiting">대기중</p>
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