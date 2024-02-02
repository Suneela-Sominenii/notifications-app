package com.example.notificationslistener3.contorller;

import com.example.notificationslistener3.service.NotificationProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProducerController {

    @Autowired
    NotificationProducer notificationProducer;

    @PostMapping("/sendMsgToProd3")
    public void sendMsgToProducer(@RequestBody String message){
        notificationProducer.sendMsgToProducer(message);
    }
}