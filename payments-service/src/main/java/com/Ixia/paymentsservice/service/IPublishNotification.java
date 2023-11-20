package com.Ixia.paymentsservice.service;

public interface IPublishNotification {

    void sendMessageToTopic(String message);
}
