<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<div class="wanted_detail_wrap">
    <div class="explain">
        <div class="intro_wanted">
            <div class="left">
                <div class="picture">
                    <img src="https://picsum.photos/1000">
                </div>
                <div class="text">${wantedDetail.detail}</div>
                <div class="skills">
                    <ul>
						<c:forEach var="mySkills" items="${wantedDetail.mySkills}">
                        	<li class="skill_items">${mySkills.skillsCodeName}</li>
                        </c:forEach>
                    </ul>
                </div>
            </div>
            <div class="right">
                <div class="follow">
                    <!--지원하기 클릭-->
                    <!--
                    <div class="right_apply">
                        <div class="apply_head">
                            <h2>지원하기</h2>
                            <p><a href="#">뒤로</a></p>
                        </div>
                        <div class="apply_click">
                            <ul>
                                <li class="apply_info">
                                    <h2>지원 정보</h2>
                                    <ul>
                                        <li>
                                            <h3>이름</h3>
                                            <p>이름</p>
                                        </li>
                                        <li>
                                            <h3>이름</h3>
                                            <p>이름</p>
                                        </li>
                                        <li>
                                            <h3>이름</h3>
                                            <p>이름</p>
                                        </li>
                                    </ul>
                                </li>
                                <li class="apply_choice">
                                    <h2>지원서 선택</h2>
                                    <ul>
                                        <li>
                                            <div class="check">
                                                <input type="checkbox">
                                            </div>
                                            <div class="resumes">
                                                <strong>이력서 이름</strong>
                                                <p>yyyy.mm.dd</p>
                                            </div>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                        <div class="apply_button">
                            <button><a href="">지원하기</a></button>
                        </div>
                    </div>
                    -->
                    <!--기본-->
                    <div class="right_default">
                        <div class="text">
                            <h2>${wantedDetail.title}</h2>
                            <h3>${wantedDetail.companyName}</h3>
                            <strong>${wantedDetail.positionCodeName}</strong>
                            <p>${wantedDetail.careerCodeName}</p>
                        </div>
                        <div class="buttons">
                            <div class="default">
                                <ul>
                                    <li class="apply"><a href="#">지원하기</a></li>
                                    <li class="subscribe"><a href="#">기업 구독하기</a></li>
                                    <li class="liked"><a href="#">좋아요 ♡</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="notice">
            <div class="text">
                ⚠ 본 채용정보는 동의없이 무단전재, 재배포, 재가공할 수 없으며, 구직활동 이외의  용도로 사용할 수 없습니다.
            </div>
        </div>
    </div>
    <div class="container">
        <h3>
            이름님, 이 포지션을 찾고 계셨나요?
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