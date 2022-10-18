
let companyNumberSameCheck = false;
let copnaychecktag = 1;
let agree = false;

$("#buttoncheckform-submit").click(() => {
	insert();
});


function insert() {

	if (companyNameCheck() == false) {
		alert(" 회사명을 적어주세요");
		return;
	}

	if (addressCheck() == false) {
		alert(" 주소를 적어주세요");
		return;
	}

	if (emailCheck() == false) {
		alert("이메일를적어주세요");
		return;
	}

	if (companyNumberCheck() == false) {
		alert("사업자 번호 다시 적어주세요");
		return;
	}
	if (copnaychecktag != $("#companyNumber").val()) {
		alert("사업자번호 중복체크 다시 해주세요");
		return;
	}
	if (companyNumberSameCheck == false) {
		alert("사업자번호 중복체크 해주세요");
		return;
	}


	if (regionCodeNameCheck() == false) {
		alert(" 지역을 다시 한번 확인해 주세요");
		return;
	}

	if (introCheck() == false) {
		alert("회사소개 적어주세요");
		return;
	}

	if (yearsCheck() == false) {
		alert("설립연도 적어주세요");
		return;
	}

	if (memberCountCheck() == false) {
		alert("직원수 적어주세요");
		return;
	}


	if (agree == false) {
		alert("약관에 동의 해주세요");
		return;
	}


	let data = {
		companyName: $("#companyName").val(),
		address: $("#address").val(),
		email: $("#email").val(),
		companyNumber: $("#companyNumber").val(),
		regionCodeName: $("#regionCodeName").val(),
		intro: $("#intro").val(),
		years: $("#years").val(),
		memberCount: $("#memberCount").val()
	}
	$.ajax("/companys", {
		type: "POST",
		dataType: "json",
		data: JSON.stringify(data), // http body에 들고갈 요청 데이터
		headers: { // http header에 들고갈 요청 데이터
			"Content-Type": "application/json; charset=utf-8"
		}
	}).done((res) => {
		if (res.code == 1) { // 성공
			location.href = "/main";
		} else { // 실패
			alert("회사서비스등록에 실패하였습니다.");
		}
	});

}



//주소입력창
function goPopup() {
	var pop = window.open("/companys/jusoPopup", "pop",
		"width=570,height=420, scrollbars=yes, resizable=yes");
}

function jusoCallBack(roadFullAddr) {
	$('#address').val(roadFullAddr);
}
//사업자번호 중복체크
$("#btncompanyNumberSameCheck").click(() => {
	$.ajax("/companys/companyNumberSameCheck?companyNumber=" + $(" #companyNumber").val(), {
		type: "GET",
		dataType: "json",
		async: true
	}).done((res) => {
		if (res.code == 1) { // 통신 성공
			if (res.data == false) {
				alert("사업자번호가 중복되지 않았습니다.");
				companyNumberSameCheck = true;
				copnaychecktag = $("#companyNumber").val();
				alert(copnaychecktag);
			} else {
				alert("사업자번호가 중복되었어요. 다른 아이디를 사용해주세요.");
				companyNumberSameCheck = false;
				$("#companyNumber").val("");
			}
		}
	});
});


//체크박스 여부
function ckCheck(num) {
	if ($("input:checkbox[name=item_name" + num + "]").is(":checked")) {
		alert("동의하셨습니다");
	} else {
		alert("동의해주세요");
	}
}
/****************유효성 검사*******************/

//회사명 체크 완료
function companyNameCheck() {

	let companyName = $("#companyName").val();

	if (companyName.length > 0) {
		return true;
	} else {
		return false;
	}
}
//주소 체크
function addressCheck() {

	let address = $("#address").val();

	if (address.length > 0) {
		return true;
	} else {
		return false;
	}
}

//이메일 체크
function emailCheck() {
	let email = $("#email").val();
	let emailRule = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/;
	if (emailRule.test(email)) {
		return true;
	} else {
		return false;
	}
}

//사업자 번호
function companyNumberCheck() {
	let companyNumber = $("#companyNumber").val();
	let companyNumberRule = /^[0-9]{9,12}$/;
	if (companyNumberRule.test(companyNumber)) {
		return true;
	} else {
		return false;
	}
}
//지역 셀렉에서 글자 체크
function regionCodeNameCheck() {
	let regionCodeName = $("#regionCodeName").val();
	let regionCodeNameRule = /^[가-힣]{2,4}$/;
	if (regionCodeNameRule.test(regionCodeName)) {
		return true;
	} else {
		return false;
	}
}

//회사 소개란
function introCheck() {
	let intro = $("#intro").val();
	if (intro.length > 0) {
		return true;
	} else {
		return false;
	}
}

//설립연도 DB와 같이 ~년 제외후 숫자만 
function yearsCheck() {
	let years = $("#years").val();
	let yearsRule = /^[0-9]{1,10}$/;
	if (yearsRule.test(years)) {
		return true;
	} else {
		return false;
	}
}


//직원수 
function memberCountCheck() {
	let memberCount = $("#memberCount").val();
	let memberCountRule = /^[0-9]{1,}$/;
	if (memberCountRule.test(memberCount)) {
		return true;
	} else {
		return false;
	}
}

function validation() {

	var checkbox = $(":checkbox[value='Y']");

	for (var i = 0; i < checkbox.length; i++) {

		var $this = $(checkbox[i]);

		if (!$this.is(":checked")) {
			alert('약관에 동의하지 않을 경우 가입할 수 없습니다.');
			$this.focus();
			return false;
		}
	}
	return true;
}

function ckCheck() {
	$("input:checkbox[name='item_name1']").each(function() {
		if ($(this).is(":checked") == true) {
			agree = true;
		}
		if ($(this).is(":checked") == false) {
			agree = false;
		}
	});
}



