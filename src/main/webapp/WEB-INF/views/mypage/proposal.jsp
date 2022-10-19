<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

    <%@ include file="../layout/header.jsp" %>

        <head>
            <link href="/css/proposal.css?after" rel="stylesheet">
        </head>

        <div id="wrap">
            <div id="pp_wrap">
                <div class="pp_menu">
                    <p class="pp_title">지원 현황</p>
                    <ul>
                        <li class="pp_position"><a href="/applicationstatusall/${principal.id}">지원한 포지션</a></li>
                        <li class="pp_proposal"><a href="/proposal/${principal.id}">받은 요청</a></li>
                    </ul>
                </div>


                <div class="pp_contents">
                    <p class="pp_sub_title">받은 요청</p>
                    <div class="pp_search">
                        <form name="searchProposal" action="/proposal/${requestsDto.id}">
                            <input id="keyword" type="text" placeholder="회사명 검색" name="keyword"
                                value="${requestsDto.keyword}">
                            <button class="btn_search" type="submit"></button>
                        </form>
                    </div>

                    <div>
                        <table class="pp_table">
                            <thead>
                                <tr>
                                    <th>요청 회사</th>
                                    <th>요청 포지션</th>
                                    <th>작성 시간</th>
                                    <th>진행 상태</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="requestsInfoDtos" items="${requestsDto.requestsInfoDtos}">
                                    <tr>
                                        <td><a href>${requestsInfoDtos.companyName}</a></td>
                                        <td>${requestsInfoDtos.positionCodeName}</td>
                                        <td>${requestsInfoDtos.created}</td>
                                        <td>
                                            <c:choose>
                                                <c:when test="${requestsInfoDtos.status == '모집중'}">
                                                    <p class="recruiting">모집중</p>
                                                </c:when>
                                                <c:when test="${requestsInfoDtos.status == '마감'}">
                                                    <p class="end">마감</p>
                                                </c:when>
                                                <c:otherwise>
                                                    <p class="end">마감</p>
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
        <script src="https://kit.fontawesome.com/e264982194.js" crossorigin="anonymous"></script>
        <script src="/js/proposal.js"></script>
        <%@ include file="../layout/footer.jsp" %>