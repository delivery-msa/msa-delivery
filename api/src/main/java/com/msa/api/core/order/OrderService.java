package com.msa.api.core.order;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import reactor.core.publisher.Mono;

public interface OrderService {

    @GetMapping(
        value = "/order/{orderId}",
        produces = "application/json"
    )
    Mono<Order> getOrder(@PathVariable int orderId);

}
