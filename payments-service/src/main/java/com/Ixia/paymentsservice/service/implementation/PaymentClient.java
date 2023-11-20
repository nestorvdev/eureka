package com.Ixia.paymentsservice.service.implementation;

import com.Ixia.paymentsservice.model.Payment;
import com.Ixia.paymentsservice.service.IPaymentClient;
import org.springframework.stereotype.Service;

@Service
public class PaymentClient implements IPaymentClient {

    @Override
    public boolean createPayment(Payment payment){
        //TODO CALL EXTERN API TO CREATE PAYMENT
        return true;
    };

}
