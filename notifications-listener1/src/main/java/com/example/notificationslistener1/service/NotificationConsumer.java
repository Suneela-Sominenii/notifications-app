package com.example.notificationslistener1.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationConsumer {

    private static final Logger logger = LoggerFactory.getLogger(NotificationConsumer.class);

    @KafkaListener(topics = "notification-sending-listener-one", groupId = "notification-sending")
    public void consumeMsgFromTopic1(String message){
        logger.info("This is listener1, Receiving message from producer: ");
        logger.info(message);
    }
}
