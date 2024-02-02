package com.example.notificationssend.controller;


import com.example.notificationssend.service.NotificationsProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class NotificationsController {

    @Autowired
    NotificationsProducer notificationsProducer;


    @PostMapping("/sendMsgToLis1")
    public void sendMsgToListener1(@RequestBody String message){
        notificationsProducer.sendMsgToListener1(message);
    }

    @PostMapping("/sendMsgToLis2")
    public void sendMsgToListener2(@RequestBody String message){
        notificationsProducer.sendMsgToListener2(message);
    }

    @PostMapping("/sendMsgToLis3")
    public void sendMsgToListener3(@RequestBody String message){
        notificationsProducer.sendMsgToListener3(message);
    }
}
