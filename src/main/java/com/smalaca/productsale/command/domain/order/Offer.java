package com.smalaca.productsale.command.domain.order;

import java.util.List;

class Offer {
    private final List<Product> products;
    private final TeleAddressData teleaddressData;
    private final PaymentData paymentData;

    Offer(List<Product> products, TeleAddressData teleaddressData, PaymentData paymentData) {
        this.products = products;
        this.teleaddressData = teleaddressData;
        this.paymentData = paymentData;
    }
}
