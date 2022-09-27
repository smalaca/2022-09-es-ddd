package com.smalaca.productsale.api.product;


import com.smalaca.productsale.query.product.ProductDetailsDto;
import com.smalaca.productsale.query.product.ProductQueryService;

import java.util.UUID;

public class ProductRestController {
    private final ProductQueryService queryService;

    public ProductRestController(ProductQueryService queryService) {
        this.queryService = queryService;
    }

    public ProductDetailsDto displayDetails(UUID productId) {
        return queryService.displayDetails(productId);
    }
}
