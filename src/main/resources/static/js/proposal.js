function getSearchFinal() {
    $.ajax({
        type: 'GET',
        url: "/applicationstatusfinal/+id",
        data: $("form[name=search]").serialize(),
        success: function (result) {
            $('.pp_table > tbody').empty();
            if (result.length >= 1) {
                result.forEach(function () {
                    str = '<tbody>'
                    str += '<c:forEach var="requestsInfoDtos" items="${requestsDto.requestsInfoDtos}">'
                    str += '<tr>'
                    str += '<td><a href>${requestsInfoDtos.companyName}</a></td>'
                    str += '<td>${requestsInfoDtos.positionCodeName}</td>'
                    str += '<td>${requestsInfoDtos.created}</td>'
                    str += '<td><c:choose>'
                    str += '<c:when test="${requestsInfoDtos.status == `모집중`}">'
                    str += '<p class="recruiting">모집중</p>'
                    str += '</c:when>'
                    str += '<c:when test="${requestsInfoDtos.status == `마감`}">'
                    str += '<p class="end">마감</p>'
                    str += '</c:when>'
                    str += '<c:otherwise>'
                    str += '<p class="end">마감</p>'
                    str += '</c:otherwise>'
                    str += '</c:choose>'
                    str += '</td>'
                    str += '</tr>'
                    str += '</c:forEach>'
                    str += '</tbody>'
                    $('.pp_table').append(str);
                })
            }
        }
    })
}