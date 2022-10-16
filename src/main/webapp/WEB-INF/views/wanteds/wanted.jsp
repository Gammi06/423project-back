<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<div class="wanteds_page">
	<div class="search_wanted">
		<div class="all_position">
			<div class="select_head">포지션 선택</div>
			<div class="select_all">
				<select class="all">
					<c:forEach var="positions" items="${allCodes.positionsCodeDtos}">
						<option>${positions.name}</option>
					</c:forEach>
				</select>
			</div>
			<div class="select_position"><a><i class="fa fa-search"></i></a></div>
		</div>
		<div class="selects">
			<div class="select_region">
				<select class="region">
					<option selected>지역</option>
					<c:forEach var="regions" items="${allCodes.regionsCodeDtos}">
						<option>${regions.name}</option>
					</c:forEach>
				</select>
			</div>
			<div class="select_career">
				<select class="career">
					<option selected>경력</option>
					<c:forEach var="careers" items="${allCodes.careersCodeDtos}">
						<option>${careers.name}</option>
					</c:forEach>
				</select>
			</div>
			<div class="select_skill">
				<select class="skill">
					<option selected>기술스택</option>
					<c:forEach var="skills" items="${allCodes.skillsCodeDtos}">
						<option>${skills.name}</option>
					</c:forEach>
				</select>
			</div>
			<div class="selected_skills">
                    <ul>
                        <li class="selected_skills_items">
                            <strong class="skill_name">스킬명스킬명스킬명</strong>
                            <p class="select_delete"><a>x</a></p>
                        </li>
                        <li class="selected_skills_items">
                            <strong class="skill_name">스킬명</strong>
                            <p class="select_delete"><a>x</a></p>
                        </li>
                        <li class="selected_skills_items">
                            <strong class="skill_name">스킬명</strong>
                            <p class="select_delete"><a>x</a></p>
                        </li>
                    </ul>
                </div>
			<div class="select_sort">
				<select class="sort">
					<option selected>정렬</option>
					<option>최신순</option>
					<option>인기순</option>
				</select>
			</div>
		</div>
	</div>
	<div class="overBox">
		<div class="liked">
			<div class="liked_wanted">
				<div class="liked_title">♥ 내가 좋아요한 공고들</div>
				<div class="wanteds">
					<c:forEach var="wantedsLikeList" items="${wantedsLikeList}">
						<div class="wanted">
							<a href="/wanteds/${wantedsLikeList.id}">
								<div class="picture">
									<img src="https://picsum.photos/seed/picsum/200/300">
								</div>
								<div class="wanted_text">
									<div class="text">
										<ul>
											<li class="title">
												<h2>${wantedsLikeList.title}</h2>
											</li>
											<li class="content">
												<p>${wantedsLikeList.detail}</p>
											</li>
										</ul>
									</div>
									<div class="company_intro">
										<p class="company_region">${wantedsLikeList.regionCodeName}</p>
										<p class="company_name">${wantedsLikeList.companyName}</p>
									</div>
								</div>
							</a>
						</div>
					</c:forEach>
				</div>
			</div>
		</div>
		<div class="all_wanteds">
			<div class="wanteds">
				<c:forEach var="wantedsAllList" items="${pagingWantedsList.wantedsListDtos}">
					<div class="wanted">
						<a href="/wanteds/${wantedsAllList.id}">
							<div class="picture">
								<img src="https://picsum.photos/seed/picsum/200/300">
							</div>
							<div class="wanted_text">
								<div class="text">
									<ul>
										<li class="title">
											<h2>${wantedsAllList.title}</h2>
										</li>
										<li class="content">
											<p>${wantedsAllList.detail}</p>
										</li>
									</ul>
								</div>
								<div class="company_intro">
									<p class="company_region">${wantedsAllList.regionCodeName}</p>
									<p class="company_name">${wantedsAllList.companyName}</p>
								</div>
							</div>
						</a>
					</div>
				</c:forEach>
			</div>
		</div>
	</div>
	<div class="paging">
		<ul class="pagaination">
			<li class='page-item-prev${pagingWantedsList.pagingDto.first ? "-hidden" : ""}'><a href="/wanteds/?page=${pagingWantedsList.pagingDto.currentPage - 1}">이전</a></li>
			<c:forEach var="num" begin="${pagingWantedsList.pagingDto.startPageNum}" end="${pagingWantedsList.pagingDto.lastPageNum}">
				<li class='page-item${pagingWantedsList.pagingDto.currentPage + 1 == num ? "-select" : ""}'>
				<a href="/wanteds/?page= ${num-1}">${num}</a></li>
			</c:forEach>
			<li class='page-item-next${pagingWantedsList.pagingDto.last ? "-hidden" : ""}'><a href="/wanteds/?page=${pagingWantedsList.pagingDto.currentPage + 1}">다음</a></li>
		</ul>
	</div>
</div>
</body>
</html>

<script>

	

</script>