package com.ixia.checkoutservice.service.implementation;

import com.ixia.checkoutservice.model.Checkout;
import com.ixia.checkoutservice.model.Product;
import com.ixia.checkoutservice.service.ICheckoutService;
import com.ixia.checkoutservice.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckoutService implements ICheckoutService {

    private IProductService productService;

    public CheckoutService(IProductService productService) {
        this.productService = productService;
    }

    @Override
    public Checkout buildCheckout(List<String> productIds) {
        double total=0.0;
        for(String id : productIds){
            Product product = productService.getProduct(id);
            System.out.println("Answered from: "+product.getInstance());
            total+=product.getPrice();
        }
        return new Checkout("234","url website", Double.toString(total),null);
    }
}
