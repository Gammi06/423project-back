<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<div class="company_info_detail_wrap">
    <div class="explain">
        <div class="intro_company">
            <div class="left">
                <div class="picture">
                    <img src="https://picsum.photos/1000">
                </div>
                <div class="text">${companyDetail.intro}</div>
            </div>
            <div class="right">
                <div class="follow">
                    <div class="right_default">
                        <div class="text">
                            <h2>${companyDetail.companyName}</h2>
                        </div>
                        <div class="information">
                            <ul>
                                <li>
                                    <h2>대표지 주소</h2>
                                    <p>${companyDetail.address}</p>
                                </li>
                                <li>
                                    <h2>대표 메일</h2>
                                    <p>${companyDetail.email}</p>
                                </li>
                                <li>
                                    <h2>지역</h2>
                                    <p>${companyDetail.regionCodeName}</p>
                                </li>
                                <li>
                                    <h2>직원 수</h2>
                                    <p>${companyDetail.memberCount}</p>
                                </li>
                            </ul>
                        </div>
                        <div class="buttons">
                            <div class="default">
                                <ul>
                                    <li class="subscribe"><a href="#">기업 구독하기</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="container">
        <h3>
            현재 보시는 기업이 올린 채용 공고문도 살펴 보세요!
        </h3>
        <div class="wanteds">
            <div class="wanted">
                <div class="wanted">
                    <a href="#">
                    <div class="picture">
                        <img src="https://picsum.photos/seed/picsum/200/300">
                    </div>
                    <div class="wanted_text">
                        <div class="text">
                            <ul>
                                <li class="title"><h2>채용공고 타이틀 입니다 채용공고 타이틀 입니다</h2></li>
                                <li class="content"><p>설명글입니다. 설명글입니다. 설명글입니다. 설명글입니다.</p></li>
                            </ul>
                        </div>
                        <div class="company_intro">
                            <p class="company_region">지역</p>
                            <p class="company_name">회사이름</p>
                        </div>
                    </div>
                    </a>
                </div>
            </div>
        </div>
    </div>
</div>
<%@ include file="../layout/footer.jsp"%>