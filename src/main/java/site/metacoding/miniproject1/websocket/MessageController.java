package site.metacoding.miniproject1.websocket;

import java.security.Principal;

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
    public TestMessage getMessage(final Message message) throws InterruptedException {
        notificationService.sendGlobalNotification();
        return new TestMessage(HtmlUtils.htmlEscape(message.getMessageContent()));

    }

    @MessageMapping("/private-message")
    @SendToUser("/topic/private-messages")
    public TestMessage getPrivateMessage(final Message message, final Principal principal) throws InterruptedException {
        Thread.sleep(1000);
        notificationService.sendPrivateNotification(principal.getName());
        return new TestMessage(HtmlUtils.htmlEscape(
                "Sending private message to user " + principal.getName() + " : " + message.getMessageContent()));
    }

    @GetMapping("/wstest")
    public String getTestPage() {
        return "websocket/wstest";
    }

}
