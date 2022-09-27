package com.smalaca.productsale.command.domain.order;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

class Order {
    private UUID id;
    private final List<Product> products;

    Order(List<Product> products) {
        this.products = products;
    }

    Offer confirm(TeleAddressData teleaddressData, PaymentData paymentData) {
        return new Offer(products, teleaddressData, paymentData);
    }

    List<Product> getProducts() {
        return products;
    }
}
