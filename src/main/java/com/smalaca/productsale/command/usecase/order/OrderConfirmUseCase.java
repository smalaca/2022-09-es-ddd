package com.smalaca.productsale.command.usecase.order;

import com.smalaca.productsale.command.domain.order.OrderService;

import java.util.UUID;

public class OrderConfirmUseCase {
    private final OrderService orderService;

    public OrderConfirmUseCase(OrderService orderService) {
        this.orderService = orderService;
    }

    public void confirm(String teleaddressData, String paymentData, UUID orderId) {
        orderService.confirm(teleaddressData, paymentData, orderId);
    }
}
