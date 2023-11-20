package com.Ixia.notifications.service.implementation;

import com.Ixia.notifications.service.INotificationConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationConsumer implements INotificationConsumer {

    Logger log= LoggerFactory.getLogger(NotificationConsumer.class);

    @Override
    @RabbitListener(queues = "send-notification")
    public void consume(String message) {
        log.info("Message Received from send-notification: "+message);
    }
}
