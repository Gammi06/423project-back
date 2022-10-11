<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

    <%@ include file="../layout/header.jsp" %>

        <div id="wrap">
            <div id="asf_wrap">
                <div class="asf_menu">
                    <p class="asf_title">지원 현황</p>
                    <ul>
                        <li class="asf_position"><a href="/applicationstatusall">지원한 포지션</a></li>
                        <li class="asf_proposal"><a href="/proposal">받은 요청</a></li>
                    </ul>
                </div>

                <div class="asf_contents">
                    <div class="asf_counts">
                        <div class="asf_count_all">
                            <a href="/applicationstatusall">
                                <p class="asf_all_count">99</p>
                                <p class="asf_all_text">전체</p>
                            </a>
                        </div>
                        <div class="asf_count_c">
                            <a href="/applicationstatus">
                                <p class="asf_count">99</p>
                                <p class="asf_text">지원 완료</p>
                            </a>
                        </div>
                        <div class="asf_count_final">
                            <a href="/applicationstatusfinal">
                                <p class="asf_final_count">99</p>
                                <p class="asf_final_text">최종합격</p>
                            </a>
                        </div>
                    </div>

                    <div class="asf_search">
                        <form>
                            <input type="text" placeholder="회사명 검색">
                            <button class="btn_search" type="submit"></button>
                        </form>
                    </div>


                    <div>
                        <table class="asf_table">
                            <thead>
                                <tr>
                                    <th>지원 회사</th>
                                    <th>지원 포지션</th>
                                    <th>작성 시간</th>
                                    <th>진행 상태</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>지원 회사</td>
                                    <td>지원 포지션</td>
                                    <td>작성 시간</td>
                                    <td>합격</td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>

        <%@ include file="../layout/footer.jsp" %>