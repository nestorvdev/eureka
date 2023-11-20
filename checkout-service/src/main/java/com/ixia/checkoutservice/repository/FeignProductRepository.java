package com.ixia.checkoutservice.repository;

import com.ixia.checkoutservice.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//@FeignClient(name="product", url = "http://localhost:8081")  // set up wit url instead of name of service
@FeignClient(name="product-service")
//@LoadBalancerClient(value = "stores", configuration = LoadBalancerConfiguration.class)  //comment this line to disable random load balancer and the configuration
public interface FeignProductRepository {

    @RequestMapping(method = RequestMethod.GET,value="/product")
    Product getProductById(@RequestParam String id,@RequestParam boolean throwError );
}
