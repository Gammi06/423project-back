<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<div class="content">
    <div class="content_inner">
        <div class="container">
            <img src="https://picsum.photos/1000">
            <div class="intro">
                <div class="title">
                    <a href="#">
                        <div class="wanted_info">
                            <strong>타이틀</strong>
                            <p>설명글</p>
                        </div>
                        <p class="wanted_link">바로가기></p>
                    </a>
                </div>
            </div>
        </div>
        <div class="intro_title">
            <strong>나에게 맞는 채용 공고</strong>
            <!--로그인시-->
            <!-- <p>(이름)님의 포지션에 맞춘 공고들을 살펴보세요!</p> -->
            <!--비로그인시-->
            <p>로그인을 해서 나에게 맞는 공고를 설정해보세요!</p>
        </div>
        <div class="wanteds">
        	<c:forEach var="wantedsList" items="${wantedsList}">
	        	<div class="wanted">
	                <a>
	                <div class="picture">
	                    <img src="https://picsum.photos/seed/picsum/200/300">
	                </div>
	                <div class="wanted_text">
	                    <div class="text">
	                        <ul>
	                            <li class="title"><h2>${wantedsList.title}</h2></li>
	                            <li class="content_text"><p>${wantedsList.detail}</p></li>
	                        </ul>
	                    </div>
	                    <div class="company_intro">
	                        <p class="company_region">${wantedsList.regionCodeName}</p>
	                        <p class="company_name">${wantedsList.companyName}</p>
	                    </div>
	                </div>
	                </a>
	            </div>
        	</c:forEach>
        </div>
        <div class="more">
            <h2><a href="#">더 많은 채용공고 보기 ></a></h2>
        </div>
    </div>
</div>
<div class="banner_1">
        <div class="ads">
        <div class="join_ads">
            <div class="title">
                <p class="logo">구해줘용&nbsp</p><p class="text"> 사용해야 하는 이유?</p>
            </div>
            <p class="content">타 사이트보다 합격률이 1.5배 높아요!</p>
            <!--미로그인시-->
            <p><a href="#">✔ 회원가입하기</a></p>
            <!--로그인시-->
            <!--<p class="link"><a href="#">✔ 프로필 수정하기</a></p> -->
        </div>
    </div>
</div>
<div class="banner_2">
    <div class="ads">
        <div class="metacoding">
            <p class="title">알려드릴게요, '메타코딩' 해야 하는 이유</p>
            <p class="content">당신의 능력을 기를수 있는 프리미엄 수업, 해야 한다면 지금입니다!</p>
            <p class="link"><a href="https://www.youtube.com/c/%EB%A9%94%ED%83%80%EC%BD%94%EB%94%A9" target="_blank">바로가기 ></a></p>
        </div>
    </div>
</div>
<div class="customer">
    <div class="service">
        <div class="service_title">
            <strong>채용 공고를 보고 계셨나요?</strong>
        </div>
        <div class="service_nav">
            <ul class="buttons">
                <li><a href="#">채용공고</a></li>
                <li><a href="#">프로필</a></li>
                <li><a href="#">이력서</a></li>
                <li><a href="#">고객센터</a></li>
            </ul>
        </div>
    </div>
</div>
<%@ include file="../layout/footer.jsp"%>