package com.Ixia.paymentsservice.controller;

import com.Ixia.paymentsservice.model.Payment;
import com.Ixia.paymentsservice.service.IPaymentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentRestController {

    private IPaymentService paymentService;

    public PaymentRestController(IPaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping()
    public void createPayment(@RequestBody Payment payment){
        paymentService.createPayment(payment);
    }

}
