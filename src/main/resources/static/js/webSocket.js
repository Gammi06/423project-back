let stompClient = null;
let headerNotificationCount = 0;
let proposalNotificationCount = 0;
let applicationNotificationCount = 0;

function connect() {
    let socket = new SockJS('/our-websocket');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame) {
        console.log('Connected: ' + frame);
        updateHeaderNotificationDisplay();
        updateProposalNotificationDisplay();
        updateApplicationNotificationDisplay();
        stompClient.subscribe('/topic/all', function (message) {
            showMessage(JSON.parse(message.body).content);
        });

        stompClient.subscribe('/topic/proposal', function (message) {
            showMessage(JSON.parse(message.body).content);
        });

        stompClient.subscribe('/topic/application', function (message) {
            showMessage(JSON.parse(message.body).content);
        });

        stompClient.subscribe('/user/topic/private-messages', function (message) {
            showMessage(JSON.parse(message.body).content);
        });

        stompClient.subscribe('/topic/global-notifications', function () {
            headerNotificationCount = headerNotificationCount + 1;
            updateHeaderNotificationDisplay();
        });

        stompClient.subscribe('/topic/proposal-notifications', function () {
            proposalNotificationCount = proposalNotificationCount + 1;
            updateProposalNotificationDisplay();
        });

        stompClient.subscribe('/topic/application-notifications', function () {
            applicationNotificationCount = applicationNotificationCount + 1;
            updateApplicationNotificationDisplay();
        });

        stompClient.subscribe('/user/topic/private-notifications', function (message) {
            headerNotificationCount = headerNotificationCount + 1;
            updateHeaderNotificationDisplay();
        });
    });
}

function showMessage(message) {
    $(".messages").append("<p>" + message + "</p>");
}

function sendFirstAlarm() {
    console.log("sending first alarm");
    stompClient.send("/ws/firstalarm");
}

function sendProposalAlarm() {
    console.log("sending proposal alarm");
    stompClient.send("/ws/proposalalarm");
}

function sendApplicationAlarm() {
    console.log("sending application alarm");
    stompClient.send("/ws/applicationalarm");
}


function sendPrivateMessage() {
    console.log("sending private message");
    stompClient.send("/ws/private-message", {}, JSON.stringify({ 'messageContent': $("#private-message").val() }));
}

function updateHeaderNotificationDisplay() {
    if (headerNotificationCount == 0) {
        $(".notifications").hide();
    } else {
        $(".notifications").show();
        $(".notifications").text(headerNotificationCount);
    }
}

function updateProposalNotificationDisplay() {
    if (proposalNotificationCount == 0) {
        $(".proposal_notifications").hide();
    } else {
        $(".proposal_notifications").show();
        $(".proposal_notifications").text(proposalNotificationCount);
    }
}

function updateApplicationNotificationDisplay() {
    if (applicationNotificationCount == 0) {
        $(".application_notifications").hide();
    } else {
        $(".application_notifications").show();
        $(".application_notifications").text(applicationNotificationCount);
    }
}

function resetHeaderNotificationCount() {
    headerNotificationCount = 0;
    updateHeaderNotificationDisplay();
}

function resetProposalNotificationCount() {
    proposalNotificationCount = 0;
    updateProposalNotificationDisplay();
}

function resetApplicationNotificationCount() {
    applicationNotificationCount = 0;
    updateApplicationNotificationDisplay();
}

$(".btn_proposal").click(function () {
    sendProposalAlarm();
});

$(".btn_application").click(function () {
    sendApplicationAlarm();
});

$("#send-private").click(function () {
    sendPrivateMessage();
});

$(".notifications").click(function () {
    resetHeaderNotificationCount();
});

$(".proposal_notifications").click(function () {
    resetProposalNotificationCount();
});

$(".application_notifications").click(function () {
    resetApplicationNotificationCount();
});

connect();
setTimeout(function () {
    sendFirstAlarm();
}, 2000);