package site.metacoding.miniproject1.websocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.util.HtmlUtils;

import site.metacoding.miniproject1.web.dto.response.Message;
import site.metacoding.miniproject1.web.dto.response.TestMessage;

@Controller
public class MessageController {

    @Autowired
    private NotificationService notificationService;

    @MessageMapping("/message")
    @SendTo("/topic/messages")
    public TestMessage getMessage() throws Exception {
        notificationService.sendGlobalNotification();
        return new TestMessage("회사로부터 입사 요청을 받았어요! 지금 마이페이지를 확인해보세요!");

    }

    @MessageMapping("/private-message")
    @SendToUser("/topic/private-messages")
    public TestMessage getPrivateMessage(Message message, String id) throws InterruptedException {
        Thread.sleep(1000);
        notificationService.sendPrivateNotification(id);
        return new TestMessage(HtmlUtils.htmlEscape(
                "Sending private message to user " + id + " : " + message.getMessageContent()));
    }

    @GetMapping("/wstest")
    public String getTestPage() {
        return "websocket/wstest";
    }

}
