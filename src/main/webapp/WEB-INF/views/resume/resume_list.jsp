<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>


<!------.resume03_sec시작------>
<section class="resume03_sec">
	<!---->
	<div class="sec_box">
		<div class="box_title">
			<span>최근 문서</span>
		</div>
		<div class="box_cont">
			<ul>
				<li class="cont_resumenew">
					<div class="resumenew_img">
						<a href="/resume/write"><img src="/assets/icon_resume.png"
							alt="이력서이미지"></a>
					</div>
					<div class="resumenew_text">
						<a href="/resume/write">새 이력서 작성</a>
					</div>
				</li>
				<c:forEach var="resume" items="${resumeList}">
					<li class="cont_resumelist">
						<div>
							<div class="resumelist_name">${resume.title}</div>
							<div class="resumelist_date">${resume.created}</div>
						</div>
						<div class="resumelist_btn">
							<a href="javascript:void(0);" class="btn_view"><img src="/assets/icon_view.png" alt="보기이미지"></a>
							<a href="#" class="btn_delete" value="${resume.id}"><img src="/assets/icon_delete.png" alt="삭제이미지" ></a>
						</div>
					</li>
				</c:forEach>
			</ul>
		</div>
	</div>
</section>
<!------.resume03_sec끝------>
<script src="/js/resume_delete.js"></script>


<%@ include file="../layout/footer.jsp"%>
