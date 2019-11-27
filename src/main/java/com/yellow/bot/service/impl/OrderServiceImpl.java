package com.yellow.bot.service.impl;

import com.yellow.bot.model.Item;
import com.yellow.bot.model.Order;
import com.yellow.bot.service.abstracts.OrderService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public Order fetchOrderDetails(String orderId) {

        Item item = new Item();

        item.setId("1");
        item.setName("Roadster T-Shirt");
        item.setPrice("$20.00");

        List<Item> items = new ArrayList<>();
        items.add(item);

        Order order = new Order();
        order.setId("1");
        order.setAmount("$20.00");
        order.setStatus("shipped");
        order.setItems(items);

        return order;
    }

}
