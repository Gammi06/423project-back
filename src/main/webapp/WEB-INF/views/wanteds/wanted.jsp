<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<div class="wanteds_page">
	<div class="search_wanted">
		<div class="all_position">
			<div class="select_head">포지션 선택</div>
			<div class="select_all">
				<select class="all" id="positionCode" name="positionName" onchange="ChangeValue('positionCode')">
					<c:forEach var="positions" items="${allWantedListDto.allCodesDto.positionsCodeDtos}">
						<option>${positions.name}</option>
					</c:forEach>
				</select>
			</div>
			<div class="select_position" type="button" id="btnSearch">
				<a><i class="fa fa-search"></i></a>
			</div>
		</div>
		<div class="selects">
			<div class="select_region">
				<select class="region" id="regionCode" name="regionName"
					onchange="ChangeValue('regionCode')">
					<option selected>전체</option>
					<c:forEach var="regions" items="${allWantedListDto.allCodesDto.regionsCodeDtos}">
						<option>${regions.name}</option>
					</c:forEach>
				</select>
			</div>
			<div class="select_career">
				<select class="career" id="careerCode" name="careerName"
					onchange="ChangeValue('careerCode')">
					<option selected>전체</option>
					<c:forEach var="careers" items="${allWantedListDto.allCodesDto.careersCodeDtos}">
						<option>${careers.name}</option>
					</c:forEach>
				</select>
			</div>
			<div class="select_skill">
				<select class="skill" id="skillsCode" name="skillsName"
					onchange="ChangeValue('skillsCode')">
					<option selected>전체</option>
					<c:forEach var="skills" items="${allWantedListDto.allCodesDto.skillsCodeDtos}">
						<option>${skills.name}</option>
					</c:forEach>
				</select>
			</div>
			<div class="selected_skills">
				<ul>
					<li class="selected_skills_items" id="skill1" style="display: none;">
					<strong class="skill_name" id="skillName1">test1</strong>
						<p class="select_delete" type="button" onclick="hideSkillbutton('skill1')"><a>x</a>
						</p></li>
					<li class="selected_skills_items" id="skill2" style="display: none;">
					<strong class="skill_name" id="skillName2">test2</strong>
						<p class="select_delete" type="button" onclick="hideSkillbutton('skill2')"><a>x</a>
						</p></li>
					<li class="selected_skills_items" id="skill3" style="display: none;">
					<strong class="skill_name" id="skillName3">test3</strong>
						<p class="select_delete" type="button" onclick="hideSkillbutton('skill3')"><a>x</a>
						</p></li>
				</ul>
			</div>
			<div class="select_sort">
				<select class="sort">
					<option selected>최신순</option>
					<option>인기순</option>
				</select>
			</div>
		</div>
	</div>
	<div class="overBox">
		<c:if test="${!empty principal}">
			<div class="liked">
				<div class="liked_wanted">
					<div class="liked_title">♥ 내가 좋아요한 공고들</div>
					<div class="wanteds">
						<c:forEach var="wantedsLikeList" items="${allWantedListDto.wantedsLikeListDtos}">
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
		</c:if>
			<div class="all_wanteds">
				<div class="wanteds" id="wanteds">
					<c:forEach var="wantedsAllList" items="${allWantedListDto.pagingWantedsListDto.wantedsListDtos}">
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
			<li class='page-item-prev${allWantedListDto.pagingWantedsListDto.pagingDto.first ? "-hidden" : ""}'>
				<a href="/wanteds/?page=${allWantedListDto.pagingWantedsListDto.pagingDto.currentPage - 1}">이전</a>
			</li>
			<c:forEach var="num"
				begin="${allWantedListDto.pagingWantedsListDto.pagingDto.startPageNum}"
				end="${allWantedListDto.pagingWantedsListDto.pagingDto.lastPageNum}">
				<li class='page-item${allWantedListDto.pagingWantedsListDto.pagingDto.currentPage + 1 == num ? "-select" : ""}'>
					<a href="/wanteds/?page= ${num-1}">${num}</a>
				</li>
			</c:forEach>
			<li
				class='page-item-next${allWantedListDto.pagingWantedsListDto.pagingDto.last ? "-hidden" : ""}'>
				<a href="/wanteds/?page=${allWantedListDto.pagingWantedsListDto.pagingDto.currentPage + 1}">다음</a>
			</li>
		</ul>
		<div>first: ${allWantedListDto.pagingWantedsListDto.pagingDto.first}</div>
		<div>last: ${allWantedListDto.pagingWantedsListDto.pagingDto.last}</div>
		<div>startPageNum: ${allWantedListDto.pagingWantedsListDto.pagingDto.startPageNum}</div>
		<div>lastPageNum: ${allWantedListDto.pagingWantedsListDto.pagingDto.lastPageNum}</div>
		<div>currentPage: ${allWantedListDto.pagingWantedsListDto.pagingDto.currentPage}</div>
	</div>
</div>
</body>
</html>

<script src="/js/wanted.js"></script>