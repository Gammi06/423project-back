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
                <div class="text">${companyDetail.companyDetailDto.intro}</div>
            </div>
            <div class="right">
                <div class="follow">
                    <div class="right_default">
                        <div class="text">
                            <h2>${companyDetail.companyDetailDto.companyName}</h2>
                        </div>
                        <div class="information">
                            <ul>
                                <li>
                                    <h2>대표지 주소</h2>
                                    <p>${companyDetail.companyDetailDto.address}</p>
                                </li>
                                <li>
                                    <h2>대표 메일</h2>
                                    <p>${companyDetail.companyDetailDto.email}</p>
                                </li>
                                <li>
                                    <h2>지역</h2>
                                    <p>${companyDetail.companyDetailDto.regionCodeName}</p>
                                </li>
                                <li>
                                    <h2>직원 수</h2>
                                    <p>${companyDetail.companyDetailDto.memberCount}</p>
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
			<c:forEach var="wantedsList" items="${companyDetail.wantedsListDtos}">
				<div class="wanted">
				    <div class="wanted">
				        <a href="/wanteds/${wantedsList.id}">
				        <div class="picture">
				            <img src="https://picsum.photos/seed/picsum/200/300">
				        </div>
				        <div class="wanted_text">
				            <div class="text">
				                <ul>
				                    <li class="title"><h2>${wantedsList.title}</h2></li>
	                                <li class="content"><p>${wantedsList.detail}</p></li>
				                </ul>
				            </div>
				            <div class="company_intro">
				                <p class="company_region">${wantedsList.regionCodeName}</p>
	                            <p class="company_name">${wantedsList.companyName}</p>
				            </div>
				        </div>
				        </a>
				    </div>
				</div>
			</c:forEach>
        </div>
    </div>
</div>
<%@ include file="../layout/footer.jsp"%>