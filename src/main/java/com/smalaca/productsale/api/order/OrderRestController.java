package com.smalaca.productsale.api.order;


import com.smalaca.productsale.command.gateway.order.OrderCommandService;

public class OrderRestController {
    private final OrderCommandService service;

    public OrderRestController(OrderCommandService service) {
        this.service = service;
    }

    public void confirm() {
        service.confirm();
    }
}
