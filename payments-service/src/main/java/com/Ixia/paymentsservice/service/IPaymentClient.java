package com.Ixia.paymentsservice.service;

import com.Ixia.paymentsservice.model.Payment;

public interface IPaymentClient {
    boolean createPayment(Payment payment);
}
