var stompClient = null;
var notificationCount = 0;

function connect() {
    var socket = new SockJS('/our-websocket');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame) {
        console.log('Connected: ' + frame);
        updateNotificationDisplay();

        stompClient.subscribe('/topic/all', function (message) {
            showMessage(JSON.parse(message.body).content);
        });

        stompClient.subscribe('/topic/messages', function (message) {
            showMessage(JSON.parse(message.body).content);
        });

        stompClient.subscribe('/user/topic/private-messages', function (message) {
            showMessage(JSON.parse(message.body).content);
        });

        stompClient.subscribe('/topic/global-notifications', function () {
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
    $(".messages").append("<p>" + message + "</p>");
}

function sendMessage() {
    console.log("sending message");
    var alarm = {
        message: "그냥 센드메세지"
        , date: new Date()
    };
    stompClient.send("/ws/message", {}, JSON.stringify(alarm));
}

function sendFirstAlarm() {
    console.log("sending message");
    stompClient.send("/ws/firstalarm");
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

$(".btn_proposal").click(function () {
    sendMessage();
});

$(".btn_application").click(function () {
    sendAppMessage();
});

$("#send-private").click(function () {
    sendPrivateMessage();
});

$(".notifications").click(function () {
    resetNotificationCount();
});

connect();
setTimeout(function () {
    sendFirstAlarm();
}, 3000);