package com.Ixia.paymentsservice.service.implementation;

import com.Ixia.paymentsservice.service.IPublishNotification;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class PublishNotification implements IPublishNotification {

    public RabbitTemplate rabbitTemplate;

    public PublishNotification(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }
    @Override
    public void sendMessageToTopic(String message) {
        rabbitTemplate.convertAndSend("send-notification",message);
    }

}
