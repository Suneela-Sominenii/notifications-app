package com.example.notificationssend.service;


import com.example.notificationssend.util.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class NotificationsProducer {

    private static final Logger logger = LoggerFactory.getLogger(NotificationsProducer.class);

    @Autowired
    KafkaTemplate<String , String> kafkaTemplate;

    public void sendMsgToListener1(String message){
        try{
            this.kafkaTemplate.send(Constants.NOTIFICATION_TOPIC1, message);
            logger.info("Sending to listener 1 : ");
            logger.info(message);
        }catch (Exception e){
            logger.error("Error getting while sending topic to listener 1... ");
        }
    }

    public void sendMsgToListener2(String message){
        try{
            this.kafkaTemplate.send(Constants.NOTIFICATION_TOPIC2, message);
            logger.info("Sending to listener 2 : ");
            logger.info(message);
        }catch (Exception e){
            logger.error("Error getting while sending topic to listener 2... ");
        }
    }

    public void sendMsgToListener3(String message){
        try{
            this.kafkaTemplate.send(Constants.NOTIFICATION_TOPIC3, message);
            logger.info("Sending to listener 3 : ");
            logger.info(message);
        }catch (Exception e){
            logger.error("Error getting while sending topic to listener 3... ");
        }
    }
}
