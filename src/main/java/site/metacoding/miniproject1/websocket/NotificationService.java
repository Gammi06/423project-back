package site.metacoding.miniproject1.websocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import site.metacoding.miniproject1.web.dto.response.PushMessage;

@Service
public class NotificationService {

    private SimpMessagingTemplate messagingTemplate;

    @Autowired
    public NotificationService(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    public void sendGlobalNotification() {
        PushMessage message = new PushMessage("Global Notification");
        messagingTemplate.convertAndSend("/topic/global-notifications", message);
    }

    public void sendProposalNotification() {
        PushMessage message = new PushMessage("Proposal Notification");
        messagingTemplate.convertAndSend("/topic/proposal-notifications", message);
    }

    public void sendApplicationNotification() {
        PushMessage message = new PushMessage("Application Notification");
        messagingTemplate.convertAndSend("/topic/application-notifications", message);
    }

    public void sendPrivateNotification(String id) {
        PushMessage message = new PushMessage("Private Notification");
        messagingTemplate.convertAndSendToUser(id, "/topic/private-notifications", message);
    }
}
