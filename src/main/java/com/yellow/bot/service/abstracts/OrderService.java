package com.yellow.bot.service.abstracts;

import com.yellow.bot.model.Order;

public interface OrderService {

    Order fetchOrderDetails(String orderId);

}
