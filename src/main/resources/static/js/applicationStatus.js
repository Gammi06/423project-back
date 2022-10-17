function getSearchAll() {
    $.ajax({
        type: 'GET',
        url: "/applicationstatusall/+id",
        data: $("form[name=searchAll]").serialize(),
        success: function (result) {
            $('.asa_table > tbody').empty();
            if (result.length >= 1) {
                result.forEach(function () {
                    str = '<tbody>'
                    str += '<c:forEach var="statusInfoDtos" items="${statusAllDto.statusInfoDtos}">'
                    str += '<tr>'
                    str += '<td><a href="#">${statusInfoDtos.companyName}</a> </td>'
                    str += '<td>${statusInfoDtos.positionCodeName}</td>'
                    str += '<td>${statusInfoDtos.created}</td>'
                    str += '<td>'
                    str += '<c:choose>'
                    str += '<c:when test="${statusInfoDtos.state == 0}">'
                    str += '<p class="waiting">대기중</p>'
                    str += '</c:when>'
                    str += '<c:when test="${statusInfoDtos.state == 1}">'
                    str += '<p class="pass">합격</p>'
                    str += '</c:when>'
                    str += '<c:when test="${statusInfoDtos.state == 2}">'
                    str += '<p class="fail">불합격</p>'
                    str += '</c:when>'
                    str += '<c:otherwise>'
                    str += '<p class="waiting">대기중</p>'
                    str += '</c:otherwise>'
                    str += '</c:choose>'
                    str += '</td>'
                    str += '</tr>'
                    str += '</c:forEach>'
                    str += '</tbody>'
                    $('.asa_table').append(str);
                })
            }
        }
    })
}

function getSearch() {
    $.ajax({
        type: 'GET',
        url: "/applicationstatus/+id",
        data: $("form[name=search]").serialize(),
        success: function (result) {
            $('.as_table > tbody').empty();
            if (result.length >= 1) {
                result.forEach(function () {
                    str = '<tbody>'
                    str += '<c:forEach var="statusWaitingInfoDtos" items="${statusWaitingDto.statusWaitingInfoDtos}">'
                    str += '<tr>'
                    str += '<td><a href="#">${statusWaitingInfoDtos.companyName}</a></td>'
                    str += '<td>${statusWaitingInfoDtos.positionCodeName}</td>'
                    str += '<td>${statusWaitingInfoDtos.created}</td>'
                    str += '<td><p class="waiting">대기중</p></td>'
                    str += '</tr>'
                    str += '</c:forEach>'
                    str += '</tbody>'
                    $('.as_table').append(str);
                })
            }
        }
    })
}

function getSearchFinal() {
    $.ajax({
        type: 'GET',
        url: "/applicationstatusfinal/+id",
        data: $("form[name=search]").serialize(),
        success: function (result) {
            $('.asf_table > tbody').empty();
            if (result.length >= 1) {
                result.forEach(function () {
                    str = '<tbody>'
                    str += '<c:forEach var="statusFinalInfoDtos" items="${statusFinalDto.statusFinalInfoDtos}">'
                    str += '<tr>'
                    str += '<td><a href="#">${statusFinalInfoDtos.companyName}</a></td>'
                    str += '<td>${statusFinalInfoDtos.positionCodeName}</td>'
                    str += '<td>${statusFinalInfoDtos.created}</td>'
                    str += '<td><p class="pass">합격</p></td>'
                    str += '</tr>'
                    str += '</c:forEach>'
                    str += '</tbody>'
                    $('.asf_table').append(str);
                })
            }
        }
    })
}
