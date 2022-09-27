package com.smalaca.productsale.command.domain.order;

import java.util.UUID;

public interface OrderRepository {
    Order findBy(UUID orderId);
}
