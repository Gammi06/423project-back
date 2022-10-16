var stompClient = null;
var notificationCount = 0;

$(document).ready(function () {
    console.log("page is ready");
    connect();

    $(".btn_proposal").click(function () {
        sendMessage();
    });

    $("#send-private").click(function () {
        sendPrivateMessage();
    });

    $(".notifications").click(function () {
        resetNotificationCount();
    });
});

function connect() {
    var socket = new SockJS('/our-websocket');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame) {
        console.log('Connected: ' + frame);
        updateNotificationDisplay();
        stompClient.subscribe('/topic/messages', function (message) {
            showMessage(JSON.parse(message.body).content);
        });

        stompClient.subscribe('/user/topic/private-messages', function (message) {
            showMessage(JSON.parse(message.body).content);
        });

        stompClient.subscribe('/topic/global-notifications', function (message) {
            notificationCount = notificationCount + 1;
            updateNotificationDisplay();
        });

        stompClient.subscribe('/user/topic/private-notifications', function (message) {
            notificationCount = notificationCount + 1;
            updateNotificationDisplay();
        });
    });
}

function showMessage(message) {
    $(".messages").append("<p>"+message+"</p>");
}

function sendMessage() {
    console.log("sending message");
    var alarm = {
    message: "지금 새로운 공고를 확인해보세요!"
    , date: new Date()
};
    stompClient.send("/ws/message", {}, JSON.stringify(alarm));
}

function sendPrivateMessage() {
    console.log("sending private message");
    stompClient.send("/ws/private-message", {}, JSON.stringify({ 'messageContent': $("#private-message").val() }));
}

function updateNotificationDisplay() {
    if (notificationCount == 0) {
        $(".notifications").hide();
    } else {
        $(".notifications").show();
        $(".notifications").text(notificationCount);
    }
}

function resetNotificationCount() {
    notificationCount = 0;
    updateNotificationDisplay();
}