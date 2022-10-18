<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

    <%@ include file="../layout/header.jsp" %>

        <head>
            <link href="/css/mypage.css" rel="stylesheet">
        </head>

        <div id="wrap">
            <div id="mp_wrap">
                <div class="mypage">

                    <p class="mypage_title">My Page</p>

                    <div class="mp_info">
                        <div class="mp_account">
                            <c:forEach var="userInfoDtos" items="${infoAllDto.userInfoDtos}">
                                <div class="mp_img"></div>
                                <div class="mp_acc">
                                    <p class="mp_name">${userInfoDtos.userName}</p>
                                    <p class="mp_call">${userInfoDtos.phoneNumber}</p>
                                    <p class="mp_email">${userInfoDtos.email}</p>
                                </div>
                                <div class="mp_acc_setting">
                                    <button>
                                        <a href="#">계정 설정하기</a>
                                    </button>
                                </div>
                            </c:forEach>
                        </div>
                        <div class="mp_status">
                            <c:forEach var="infoCountDtos" items="${infoAllDto.infoCountDtos}">
                                <ul>
                                    <li><a href="/applicationstatusall">
                                            <div class="mp_status_li1">지원 현황</div>
                                            <div>${infoCountDtos.statusAll}</div>
                                        </a></li>
                                    <li><a href="#">
                                            <div class="mp_status_li2">좋아요</div>
                                            <div>${infoCountDtos.likesCount}</div>
                                        </a></li>
                                    <li><a href="/proposal">
                                            <div class="mp_status_li3">받은 요청</div>
                                            <p class="proposal_notifications"></p>
                                            <div>${infoCountDtos.requestsCount}</div>
                                        </a></li>
                                    <li><a href="#">
                                            <div class="mp_status_li4">구독</div>
                                            <div>${infoCountDtos.subscribesCount}</div>
                                        </a></li>
                                </ul>
                            </c:forEach>
                        </div>
                    </div>

                    <div class="logout">
                        <button>
                            <a href="#">로그아웃</a>
                        </button>
                    </div>
                    <div class="btn_proposal"><button>
                            <a href="#">제안하기</a>
                        </button></div>
                    <div class="btn_application"><button>
                            <a href="#">지원하기</a>
                        </button></div>
                    <p class="application_notifications"></p>
                    <div class="btn_login"><button>
                            <a href="#">로그인</a>
                        </button></div>
                    <div class="btn_private-proposal"><button>
                            <a href="#">개인한테 제안하기</a>
                        </button></div>

                </div>

                <div class="mp_contents">
                    <div class="mp_applications">
                        <c:forEach var="statusCountDtos" items="${infoAllDto.statusCountDtos}">
                            <p class="mp_application_title">지원 현황</p>
                            <div class="mp_application_counts">
                                <div class="mp_app_all">
                                    <a href="/applicationstatusall">
                                        <p class="mp_all_count">${statusCountDtos.statusAll}</p>
                                        <p class="mp_all_text">전체</p>
                                    </a>
                                </div>
                                <div class="mp_app">
                                    <a href="/applicationstatus">
                                        <p class="mp_count">${statusCountDtos.statusC}</p>
                                        <p class="mp_text">지원 완료</p>
                                    </a>
                                </div>
                                <div class="mp_app_final">
                                    <a href="/applicationstatusfinal">
                                        <p class="mp_final_count">${statusCountDtos.statusFinal}</p>
                                        <p class="mp_final_text">최종 합격</p>
                                    </a>
                                </div>
                        </c:forEach>
                    </div>
                </div>

                <div class="mp_position">
                    <p class="mp_position_title">프로필</p>
                    <div class="mp_pro_contents">
                        <c:forEach var="userInfoDtos" items="${infoAllDto.userInfoDtos}">
                            <c:choose>
                                <c:when test="${userInfoDtos.positionCodeName eq null}">
                                    <p class="mp_profile_position">현재 구직중인 <span>포지션을</span> 설정해주세요</p>
                                </c:when>
                                <c:otherwise>
                                    <p class="mp_profile_position">
                                        현재 구직중인 포지션은 <span>${userInfoDtos.positionCodeName}</span></p>
                                </c:otherwise>
                            </c:choose>
                            <button>
                                <a href="#">프로필 수정하기</a>
                            </button>
                        </c:forEach>
                    </div>
                </div>

                <div class="mp_recommend">
                    <p class="mp_reco_title">추천</p>
                    <div class="mp_recos">
                        <c:forEach var="companyInfoDtos" items="${infoAllDto.companyInfoDtos}">
                            <div class="mp_reco${companyInfoDtos.no}">
                                <a href="#">
                                    <div class="mp_reco${companyInfoDtos.no}_1">
                                        <img src="/assets/image.png">
                                    </div>
                                    <p class="mp_reco_com_title">${companyInfoDtos.title}</p>
                                    <p class="mp_reco_com_content">${companyInfoDtos.detail}</p>
                                    <div class="mp_company">
                                        <img>
                                        <p class="mp_company_name">${companyInfoDtos.companyName}</p>
                                    </div>
                                </a>
                            </div>
                        </c:forEach>
                    </div>
                </div><!-- .mprecommend -->
            </div>
            <!--.mpcontents -->
        </div><!-- .mpwrap -->
        </div>

        <%@ include file="../layout/footer.jsp" %>