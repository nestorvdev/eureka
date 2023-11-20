package com.Ixia.productservice.controller;

import com.Ixia.productservice.model.Product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/product")
public class ProductRestController {

    Logger log = LoggerFactory.getLogger(ProductRestController.class);

    @GetMapping
    public Product getProduct(@RequestParam String id, @RequestParam(defaultValue = "false") boolean throwError){
        log.info("getting product: "+id);
        if(throwError){throw new RuntimeException("Message received - Error ---");}
        else{return new Product(id,"Notebook",2000,"Instance 1");}}
}
