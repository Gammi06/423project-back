package site.metacoding.miniproject1.websocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import site.metacoding.miniproject1.web.dto.response.PushMessage;

@Service
public class WebSocketService {

    private final SimpMessagingTemplate messagingTemplate;
    private final NotificationService notificationService;

    @Autowired
    public WebSocketService(SimpMessagingTemplate messagingTemplate, NotificationService notificationService) {
        this.messagingTemplate = messagingTemplate;
        this.notificationService = notificationService;
    }

    public void notifyFrontend(final String message) {
        PushMessage response = new PushMessage(message);
        notificationService.sendGlobalNotification();
        messagingTemplate.convertAndSend("/topic/messages", response);

    }

    public void notifyUser(final String id, final String message) {
        PushMessage response = new PushMessage(message);
        notificationService.sendPrivateNotification(id);
        messagingTemplate.convertAndSendToUser(id, "/topic/private-messages", response);

    }
}