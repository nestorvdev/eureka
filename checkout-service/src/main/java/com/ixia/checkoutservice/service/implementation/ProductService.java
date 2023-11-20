package com.ixia.checkoutservice.service.implementation;

import com.ixia.checkoutservice.model.Product;
import com.ixia.checkoutservice.repository.FeignProductRepository;
import com.ixia.checkoutservice.service.IProductService;
import io.github.resilience4j.circuitbreaker.CallNotPermittedException;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {
    Logger log = LoggerFactory.getLogger(ProductService.class);
    private FeignProductRepository feignProductRepository;

    public ProductService(FeignProductRepository feignProductRepository) {
        super();
        this.feignProductRepository = feignProductRepository;
    }

    @Override
    @CircuitBreaker(name = "productCB",fallbackMethod = "getProductFallBackMethod") //name is given at properties for circuit breaker
    @Retry(name ="retryCB")
    public Product getProduct(String id) {
        System.out.println("Trying to get product with id: "+id);
        return feignProductRepository.getProductById(id,true);  //modify thowError to activate error and test CircuitBreaker
    }

    public Product getProductFallBackMethod(String id, CallNotPermittedException exception){
        log.error("Circuit breaker's state is OPEN ");

        //return null product to don't break the service
        return new Product();
    }
}
