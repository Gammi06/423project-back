<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ include file="../layout/header.jsp" %>


<!------.resume03_sec시작------>
<section class="resume03_sec">
    <div class="sec_box">
        <div class="box_title"><span>최근 문서</span></div>
        <div class="box_cont">
            <ul>
                <li class="cont_resumenew">
                    <div class="resumenew_img">
                    <a href="update"><img src="/assets/icon_resume.png" alt="이력서이미지"></a>
                    </div>
                    <div class="resumenew_text"><a href="update">새 이력서 작성</a></div>
                </li>
                <li class="cont_resumelist">
                    <div class="resumelist_name">${resumeListDtoPS.title}</div>
                    <div class="resumelist_date">${resumeListDtoPS.created}</div>
                    <div class="resumelist_img">
                    <a href="#"><img src="/assets/icon_view.png" alt="보기이미지"></a>
                    <a href="#"><img src="/assets/icon_delete.png" alt="삭제이미지"></a>
                    </div>
                </li>
                <li class="cont_resumelist">
                    <div class="resumelist_name">${resumeListDtoPS.title}</div>
                    <div class="resumelist_date">${resumeListDtoPS.created}</div>
                    <div class="resumelist_img">
                    <a href="#"><img src="/assets/icon_view.png" alt="보기이미지"></a>
                    <a href="#"><img src="/assets/icon_delete.png" alt="삭제이미지"></a>
                    </div>
                </li>
                <li class="cont_resumelist">
                    <div class="resumelist_name">${resumeListDtoPS.title}</div>
                    <div class="resumelist_date">${resumeListDtoPS.created}</div>
                    <div class="resumelist_img">
                    <a href="#"><img src="/assets/icon_view.png" alt="보기이미지"></a>
                    <a href="#"><img src="/assets/icon_delete.png" alt="삭제이미지"></a>
                    </div>
                </li>
            </ul>
        </div>
    </div>
</section>
<!------.resume03_sec끝------>


<%@ include file="../layout/footer.jsp" %>
