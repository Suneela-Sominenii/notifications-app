package com.example.notificationslistener3.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

public class KafkaConfig {

    @Bean
    public NewTopic topic(){
        return TopicBuilder
                .name("notification-receiving-listener-three")
                .build();
    }

}
