package com.smalaca.productsale.api.order;


import com.smalaca.productsale.command.usecase.order.OrderConfirmUseCase;

import java.util.UUID;

public class OrderRestController {
    private final OrderConfirmUseCase orderConfirmUseCase;

    public OrderRestController(OrderConfirmUseCase orderConfirmUseCase) {
        this.orderConfirmUseCase = orderConfirmUseCase;
    }

    public void confirm(String teleaddressData, String paymentData, UUID orderId) {
        orderConfirmUseCase.confirm(teleaddressData, paymentData, orderId);
    }
}
