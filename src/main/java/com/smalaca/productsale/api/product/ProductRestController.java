package com.smalaca.productsale.api.product;


import com.smalaca.productsale.command.gateway.product.ProductCommandService;
import com.smalaca.productsale.query.product.ProductDetailsDto;
import com.smalaca.productsale.query.product.ProductQueryService;

import java.util.UUID;

public class ProductRestController {
    private final ProductQueryService queryService;
    private final ProductCommandService commandService;

    public ProductRestController(ProductQueryService queryService, ProductCommandService commandService) {
        this.queryService = queryService;
        this.commandService = commandService;
    }

    public ProductDetailsDto displayDetails(UUID productId) {
        return queryService.displayDetails(productId);
    }

    public ProductDetailsDto add() {
        UUID id = commandService.add();
        return queryService.displayDetails(id);
    }
}
