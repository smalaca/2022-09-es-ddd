package com.smalaca.productsale.command.domain.order;

import java.util.UUID;

public class OrderService {
    private final OrderRepository orderRepository;
    private final OfferRepository offerRepository;
    private final ProductRepository productRepository;

    public OrderService(
            OrderRepository orderRepository, OfferRepository offerRepository, ProductRepository productRepository) {
        this.orderRepository = orderRepository;
        this.offerRepository = offerRepository;
        this.productRepository = productRepository;
    }

    public void confirm(String teleaddressData, String paymentData, UUID orderId) {
        TeleAddressData addressData = new TeleAddressData(teleaddressData);
        PaymentData paymentDataEntity = new PaymentData(paymentData);
        Order order = orderRepository.findBy(orderId);

        if (productsAreAvailable(order)) {
            Offer offer = order.confirm(addressData, paymentDataEntity);
            offerRepository.save(offer);
        }
    }

    private boolean productsAreAvailable(Order order) {
        return productRepository.areAvailable(order.getProducts());
    }
}
