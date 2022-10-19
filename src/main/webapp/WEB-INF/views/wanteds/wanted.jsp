<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<div class="wanteds_page">
	<div class="search_wanted">
		<div class="all_position">
			<div class="select_head">포지션 선택</div>
			<div class="select_all">
				<select class="all" id="positionCode" name="positionName"
					onchange="ChangeValue('positionCode')">
					<c:forEach var="positions" items="${allCodes.positionsCodeDtos}">
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
					<c:forEach var="regions" items="${allCodes.regionsCodeDtos}">
						<option>${regions.name}</option>
					</c:forEach>
				</select>
			</div>
			<div class="select_career">
				<select class="career" id="careerCode" name="careerName"
					onchange="ChangeValue('careerCode')">
					<option selected>전체</option>
					<c:forEach var="careers" items="${allCodes.careersCodeDtos}">
						<option>${careers.name}</option>
					</c:forEach>
				</select>
			</div>
			<div class="select_skill">
				<select class="skill" id="skillsCode" name="skillsName"
					onchange="ChangeValue('skillsCode')">
					<option selected>전체</option>
					<c:forEach var="skills" items="${allCodes.skillsCodeDtos}">
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
				<c:forEach var="wantedsAllList"
					items="${pagingWantedsList.wantedsListDtos}">
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
			<li
				class='page-item-prev${pagingWantedsList.pagingDto.first ? "-hidden" : ""}'>
				<a
				href="/wanteds/?page=${pagingWantedsList.pagingDto.currentPage - 1}">이전</a>
			</li>
			<c:forEach var="num"
				begin="${pagingWantedsList.pagingDto.startPageNum}"
				end="${pagingWantedsList.pagingDto.lastPageNum}">
				<li
					class='page-item${pagingWantedsList.pagingDto.currentPage + 1 == num ? "-select" : ""}'>
					<a href="/wanteds/?page= ${num-1}">${num}</a>
				</li>
			</c:forEach>
			<li
				class='page-item-next${pagingWantedsList.pagingDto.last ? "-hidden" : ""}'>
				<a
				href="/wanteds/?page=${pagingWantedsList.pagingDto.currentPage + 1}">다음</a>
			</li>
		</ul>
	</div>
</div>
</body>
</html>

<script>
	let data = {
		positionCode : '전체',
		regionCode : '전체',
		careerCode : '전체',
		skillsCode : []	
	};

	$("#btnSearch").click(()=>{
		$.ajax("/wanteds", {
			type: "GET",
			dataType: "json",
			async: true
		}).done((res)=>{
			console.log("1");
			if(res.code == 1){
				console.log("2");
				alert("통신성공");
				console.log("3");
				location.reload();
			} else {
				alert("통신실패");
			}
		});
	});
	
	function ChangeValue(id){
		let element = document.getElementById(id);
		if(id == 'positionCode') {
			data.positionCode = element.options[element.selectedIndex].value;
		}
		if(id == 'regionCode') {
			data.regionCode = element.options[element.selectedIndex].value;
		}
		if(id == 'careerCode') {
			data.careerCode = element.options[element.selectedIndex].value;
		}
		if(id == 'skillsCode') {
			if(element.options[element.selectedIndex].value == '전체'){
				data.skillsCode.length = 0;
			} else {
				if(data.skillsCode.length >= 3) return;
				let num = data.skillsCode.length;
				data.skillsCode.push(element.options[element.selectedIndex].value);
				if(num == 0) {
					showSkillbutton('skill1', 'skillName1', element.options[element.selectedIndex].value)
				} else if(num == 1) {
					showSkillbutton('skill2', 'skillName2', element.options[element.selectedIndex].value)
				} else {
					showSkillbutton('skill3', 'skillName3', element.options[element.selectedIndex].value)
				}
			}
		}
	}
	
	function showSkillbutton(id, name, text) {
		document.getElementById(name).textContent = text;
		
		const btn = document.getElementById(id);
		btn.style.display  = 'flex';
	}
	
	function hideSkillbutton(id, name) {		
		const btn1 = document.getElementById(id);
		btn1.style.display  = 'none';
		
		if(id == 'skill1'){
			data.skillsCode.splice(0);
		} else if (id == 'skill2'){
			data.skillsCode.splice(1);
		} else {
			data.skillsCode.splice(2);
		}
	}
</script>