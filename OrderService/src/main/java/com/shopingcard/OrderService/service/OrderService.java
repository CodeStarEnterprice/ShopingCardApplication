package com.shopingcard.OrderService.service;

import com.shopingcard.OrderService.model.OrderRequest;
import com.shopingcard.OrderService.model.OrderResponse;

public interface OrderService {
    long placeOrder(OrderRequest orderRequest);

    OrderResponse getOrderDetails(long orderId);
}
