package com.ixia.checkoutservice.service;

import com.ixia.checkoutservice.model.Checkout;

import java.util.List;

public interface ICheckoutService {
    Checkout buildCheckout(List<String> productIds);
}
