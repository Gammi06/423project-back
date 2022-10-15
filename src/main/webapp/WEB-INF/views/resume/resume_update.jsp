<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ include file="../layout/header.jsp" %>


<!------.resume02_sec1시작------>
<section class="resume02_sec1">
    <div class="sec1_box">
        <p class="sec1_cont1">
            <span>${resumeUpdateDtoPS.title}</span>
        </p>
        <div>
            <div class="sec1_cont2">
                <img src="/img/logo_wonder.png" alt="이력서사진">
            </div>
            <div class="sec1_cont3">
                <ul>
                    <li><div class="cont3_key">이름</div><div class="cont3_data">${resumeUpdateDtoPS.userName}</div></li>
                    <li><div class="cont3_key">이메일</div><div class="cont3_data">${resumeUpdateDtoPS.email}</div></li>
                    <li><div class="cont3_key">전화번호</div><div class="cont3_data">${resumeUpdateDtoPS.phoneNumber}</div></li>
                </ul>
            </div>
        </div>
    </div>
</section>
<!------.resume02_sec1끝------>


<!------.resume02_sec2시작------>
<section class="resume02_sec2">
    <div class="sec2_box">
        <div class="sec2_title"><span>간단 자기소개</span></div>
        <div class="sec2_cont1">
            <ul>
                <li>
                    • 본인의 업무 경험을 기반으로 핵심역량과 업무 스킬을 간단히 작성해주세요.
                </li>
                <li>
                    • 3~5줄로 요약하여 작성하는 것을 추천합니다!
                </li>
            </ul>
        </div>
        <div class="sec2_cont2"><textarea>${resumeUpdateDtoPS.intro}</textarea></div>
    </div>
</section>
<!------.resume02_sec2끝------>


<!------.resume02_sec3시작------>
<section class="resume02_sec3">
    <div class="sec3_box">
        <div class="sec3_title"><span>경력</span></div>
        <div class="sec3_cont">
            <ul>
                <li>
                    • 담당하신 업무 중 우선순위가 높은 업무를 선별하여 최신순으로 작성해주세요.
                </li>
                <li>
                    • 신입의 경우, 직무와 관련된 대외활동, 인턴, 계약직 경력 등이 있다면 작성해주세요.
                </li>
            </ul>
        </div>
        <div class="sec3_add">
            <img src="/img/icon_add.png" alt="추가이미지"><span>추가</span>
        </div>
        <div class="sec3_work">
            <div class=work_term>YYYY. MM - YYYY. MM</div>
            <div class=work_company>회사명</div>
        </div>
    </div>
</section>
<!------.resume02_sec3끝------>


<!------.resume02_sec4시작------>
<section class="resume02_sec4">
    <div class="sec4_box">
        <div class="sec4_title"><span>학력</span></div>
        <div class="sec4_cont">
            <ul>
                <li>
                    • 최신순으로 작성해주세요.
                </li>
            </ul>
        </div>
        <div class="sec4_add">
            <img src="/img/icon_add.png" alt="추가이미지"><span>추가</span>
        </div>
        <div class="sec4_work">
            <div class=work_term>YYYY. MM - YYYY. MM</div>
            <div class=work_company>교육기관명</div>
        </div>
    </div>
</section>
<!------.resume02_sec4끝------>


<!------.resume02_sec5시작------>
<section class="resume02_sec5">
    <div class="sec5_box">
        <div class="sec5_title"><span>스킬</span></div>
        <div class="sec5_cont">
            <ul>
                <li>
                    • 개발 스택, 디자인 툴, 마케팅 툴 등 가지고 있는 직무와 관련된 스킬을 추가해보세요.
                </li>
                <li>
                    • 데이터 분석 툴이나 협업 툴 등의 사용해본 경험이 있으신 툴들도 추가해보세요.
                </li>
            </ul>
        </div>
        <div class="sec5_add">
            <img src="/img/icon_add.png" alt="추가이미지"><span>추가</span>
        </div>
        <div class="sec5_skill">
            <form>
                <select>
                    <option value="">보유한 스킬을 선택해주세요</option>
                    <option value="skill_1">스킬명 1</option>
                    <option value="skill_1">스킬명 2</option>
                    <option value="skill_1">스킬명 3</option>
                </select>
            </form>
        </div>
    </div>
</section>
<!------.resume02_sec5끝------>


<!------.resume02_sec6시작------>
<section class="resume02_sec6">
    <div class="sec6_check">
        <input type="checkbox" id="cb_resume">
        <span><label for="cb_resume">이력서 외 개인정보를 조회하는 것을 동의합니다.</label></span>
    </div>
    <div class="sec6_btn">
        <a href="#" class="btn btn_completed">
            <span>작성 완료</span>
        </a>
    </div>
</section>
<!------.resume02_sec6끝------>


<%@ include file="../layout/footer.jsp" %>
