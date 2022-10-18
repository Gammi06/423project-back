
$(".btn_delete").click((event) => {
	console.log(event);
	console.log(event.currentTarget);
	console.log(event.currentTarget.getAttribute("value"));
	let resumeId = event.currentTarget.getAttribute("value");
	deleteById(resumeId);
});

function deleteById(resumeId){
	$.ajax(`/resume/${resumeId}/delete`, {
		type: "delete",
		dataType: "json"
	}).done((res) => {
		if (res.code == 1) { // 성공
			alert("이력서 삭제 완료");
			location.reload();
			
		} else { // 실패
			alert("이력서 삭제 실패");
		}
	});
}
