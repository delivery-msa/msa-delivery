package com.msa.delivery.services;

import com.msa.api.core.order.Order;
import com.msa.api.core.order.OrderService;
import com.msa.util.exceptions.InvalidInputException;
import com.msa.util.exceptions.NotFoundException;
import com.msa.util.http.ServiceUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;


@RestController
public class OrderServiceImpl implements OrderService {

    private static final Logger LOG = LoggerFactory.getLogger(OrderServiceImpl.class);

    private final ServiceUtil serviceUtil;

    @Autowired
    public OrderServiceImpl(ServiceUtil serviceUtil) {
        this.serviceUtil = serviceUtil;
  ;  }

    @Override
    public Order getOrder(int orderId) {
        LOG.debug("/product return the found product for productId={}", orderId);

        if (orderId < 1) throw new InvalidInputException("Invalid productId: " + orderId);

        if (orderId == 13) throw new NotFoundException("No product found for productId: " + orderId);

        return new Order(orderId, "name-" + orderId);
    }
}
