package site.metacoding.miniproject1.websocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import site.metacoding.miniproject1.web.dto.response.mypage.Message;
import site.metacoding.miniproject1.web.dto.response.mypage.PushMessage;

@Controller
public class MessageController {

    @Autowired
    private NotificationService notificationService;

    @MessageMapping("/firstalarm")
    @SendTo("/topic/all")
    public PushMessage getFirstAlarm() throws Exception {
        notificationService.sendGlobalNotification();
        return new PushMessage("환영합니다!</br>새로운 공고를 확인해보세요!");
    }

    @MessageMapping("/proposalalarm")
    @SendTo("/topic/proposal")
    public PushMessage getProposalAlarm() throws Exception {
        notificationService.sendGlobalNotification();
        notificationService.sendProposalNotification();
        return new PushMessage("회사로부터 입사 요청을 받았어요!</br>지금 마이페이지를 확인해보세요!");
    }

    @MessageMapping("/applicationalarm")
    @SendTo("/topic/application")
    public PushMessage getApplicationAlarm() throws Exception {
        notificationService.sendGlobalNotification();
        notificationService.sendApplicationNotification();
        return new PushMessage("새로운 지원자가 있어요!</br>지금 관리 페이지를 확인해보세요!");
    }

    @MessageMapping("/private-message")
    @SendToUser("/topic/private-messages")
    public PushMessage getPrivateMessage(Message message, String id) throws Exception {
        Thread.sleep(1000);
        notificationService.sendPrivateNotification(id);
        return new PushMessage(HtmlUtils.htmlEscape(
                "Sending private message to user " + id + " : " + message.getMessageContent()));
    }

}
