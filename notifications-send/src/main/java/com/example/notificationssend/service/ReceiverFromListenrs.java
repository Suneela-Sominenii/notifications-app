package com.example.notificationssend.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

public class ReceiverFromListenrs {

    private static final Logger logger = LoggerFactory.getLogger(ReceiverFromListenrs.class);

    @KafkaListener(topics = "notification-receiving-listener-one", groupId = "notification-receiving")
    public void consumeMsgFromlistener1(String message){
        logger.info("This is producer, Receiving message from listener1: ");
        logger.info(message);
    }

    @KafkaListener(topics = "notification-receiving-listener-two", groupId = "notification-receiving")
    public void consumeMsgFromListener2(String message){
        logger.info("This is producer, Receiving message from listener2: ");
        logger.info(message);
    }

    @KafkaListener(topics = "notification-receiving-listener-three", groupId = "notification-receiving")
    public void consumeMsgFromListener3(String message){
        logger.info("This is producer, Receiving message from listener3: ");
        logger.info(message);
    }
}
