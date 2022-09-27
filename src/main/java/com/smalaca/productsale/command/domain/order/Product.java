package com.smalaca.productsale.command.domain.order;

import java.util.UUID;

public class Product {
    private final UUID productId;
    private final int amount;

    Product(UUID productId, int amount) {
        this.productId = productId;
        this.amount = amount;
    }
}
