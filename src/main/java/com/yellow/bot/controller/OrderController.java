package com.yellow.bot.controller;

import com.yellow.bot.model.Order;
import com.yellow.bot.service.abstracts.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping(value = "fetch/order/{orderId}")
    public Order fetchOrder(@PathVariable String orderId){
        return orderService.fetchOrderDetails(orderId);
    }


}
