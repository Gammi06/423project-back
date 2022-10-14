package site.metacoding.miniproject1.websocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import site.metacoding.miniproject1.web.dto.response.Message;

@RestController
public class WebSocketController {

    @Autowired
    private WebSocketService service;

    @PostMapping("/send-message")
    public void sendMessages(@RequestBody final Message message) {
        service.notifyFrontend(message.getMessageContent());
    }

    @PostMapping("/send-private-message/{id}")
    public void sendPrivateMessages(@PathVariable final String id, @RequestBody final Message message) {
        service.notifyUser(id, message.getMessageContent());
    }
}