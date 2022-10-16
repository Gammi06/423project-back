package site.metacoding.miniproject1.websocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import site.metacoding.miniproject1.web.dto.response.TestMessage;

@Service
public class NotificationService {

    private SimpMessagingTemplate messagingTemplate;

    @Autowired
    public NotificationService(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    public void sendGlobalNotification() {
        TestMessage message = new TestMessage("Global Notification");
        messagingTemplate.convertAndSend("/topic/global-notifications", message);
    }

    public void sendPrivateNotification(String id) {
        TestMessage message = new TestMessage("Private Notification");

        messagingTemplate.convertAndSendToUser(id, "/topic/private-notifications", message);
    }
}