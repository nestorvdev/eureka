package com.Ixia.paymentsservice.service.implementation;

import com.Ixia.paymentsservice.model.Payment;
import com.Ixia.paymentsservice.service.IPaymentClient;
import com.Ixia.paymentsservice.service.IPaymentService;
import org.springframework.stereotype.Service;

@Service
public class PaymentService implements IPaymentService {
    private PublishNotification publishNotification;
    private IPaymentClient paymentClient;

    public PaymentService(PublishNotification publishNotification,IPaymentClient paymentClient) {
        this.publishNotification = publishNotification;
        this.paymentClient = paymentClient;
    }
    @Override
    public void createPayment(Payment payment) {
        //TODO CREATE PAYMENT

        paymentClient.createPayment(payment); // EXECUTE THE PAYMENT

        publishNotification.sendMessageToTopic(payment.getClientId());  // SEND THE MESSAGE TO RABBIWMQ
    }


}
