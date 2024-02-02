package com.example.notificationslistener2.controller;

import com.example.notificationslistener2.service.NotificationProducer;
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

    @PostMapping("/sendMsgToProd2")
    public void sendMsgToProducer(@RequestBody String message){
        notificationProducer.sendMsgToProducer(message);
    }
}
