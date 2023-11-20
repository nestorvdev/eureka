package com.ixia.checkoutservice.controller;

import com.ixia.checkoutservice.model.Checkout;
import com.ixia.checkoutservice.service.ICheckoutService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value="/checkout")
public class CheckoutRestController {

    private ICheckoutService checkoutService;

    public CheckoutRestController(ICheckoutService checkoutService){
        super();
        this.checkoutService=checkoutService;
    }
    @GetMapping("/{id}")
    public Checkout getById(@PathVariable String id){
        return new Checkout(id);
    }

    @GetMapping()
    public Checkout getCheckout(@RequestParam List<String> productsIds, @RequestHeader("X-Request-from") String requestForm,@RequestHeader() Map<String,String> headers){
        System.out.println("Sent from: " + requestForm);
        if(!requestForm.equals("gateway")){return null;}
        return checkoutService.buildCheckout(productsIds);
    }

}
