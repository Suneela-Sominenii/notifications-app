package com.example.notificationslistener3.service;

import com.example.notificationslistener3.util.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class NotificationProducer {

    private static final Logger logger = LoggerFactory.getLogger(NotificationConsumer.class);

    @Autowired
    KafkaTemplate<String , String> kafkaTemplate;
    public void sendMsgToProducer(String message){
        try{
            this.kafkaTemplate.send("notification-receiving-listener-three", message);
            logger.info("Sending to producer from listener 3: ");
            logger.info(message);
        }catch (Exception e){
            logger.error("Error getting while sending message to producer... ");
        }
    }
}
