<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

    <%@ include file="../layout/header.jsp" %>

        <head>
            <link href="/css/proposal.css" rel="stylesheet">
            <script src="https://kit.fontawesome.com/e264982194.js" crossorigin="anonymous"></script>
        </head>

        <div id="wrap">
            <div id="pp_wrap">
                <div class="pp_menu">
                    <p class="pp_title">지원 현황</p>
                    <ul>
                        <li class="pp_position"><a href="/applicationstatusall">지원한 포지션</a></li>
                        <li class="pp_proposal"><a href="/proposal">받은 요청</a></li>
                    </ul>
                </div>

                <div class="pp_contents">
                    <p class="pp_sub_title">받은 요청</p>
                    <div class="pp_search">
                        <form>
                            <input type="text" placeholder="회사명 검색">
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
                                <tr>
                                    <td>요청 회사</td>
                                    <td>요청 포지션</td>
                                    <td>작성 시간</td>
                                    <td>모집중</td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>

        <%@ include file="../layout/footer.jsp" %>