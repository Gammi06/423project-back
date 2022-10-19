let data = {
    positionCode : '전체',
    regionCode : '전체',
    careerCode : '전체',
    skillsCode : [],
    stage : 0
};

$("#btnSearch").click(()=>{
    StringTest();
});

function buildWanted(wantedWidget){
    return `<div class="wanted">
    <a href="/wanteds/${wantedWidget.id}">
        <div class="picture">
            <img src="https://picsum.photos/seed/picsum/200/300">
        </div>
        <div class="wanted_text">
            <div class="text">
                <ul>
                    <li class="title">
                        <h2>${wantedWidget.title}</h2>
                    </li>
                    <li class="content">
                        <p>${wantedWidget.detail}</p>
                    </li>
                </ul>
            </div>
            <div class="company_intro">
                <p class="company_region">${wantedWidget.regionCodeName}</p>
                <p class="company_name">${wantedWidget.companyName}</p>
            </div>
        </div>
    </a>
</div>`;
}

function StringTest(){
    let queryString = "?"
    queryString = queryString + "positionsCodeName=" + data.positionCode + "&" +
    "regionsCodeName=" + data.regionCode + "&" +
    "carrerCodeName=" + data.careerCode;
    if(data.skillsCode.length != 0) {
        for(i = 0; i < data.skillsCode.length; i++) {
            queryString = queryString + "&" + "skillsCodeName=" + data.skillsCode[i];
        }
    }
    console.log(1, queryString);

    $.ajax("/api/wanteds" + queryString, {
        type: "GET",
        dataType: "json",
        async: true
    }).done((res)=>{
        
        if(res.code == 1){
            console.log(2,res);
            let wantedWidgetList = res.data.pagingWantedsListDto.wantedsListDtos;
            $("#wanteds").empty();
            wantedWidgetList.forEach((wantedWidget)=>{
                console.log("헐");
                $("#wanteds").prepend(buildWanted(wantedWidget));
            });
            alert("통신성공");
            //location.href = "/api/wanteds" + queryString;
        } else {
            alert("통신실패");
        }
    });
}

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