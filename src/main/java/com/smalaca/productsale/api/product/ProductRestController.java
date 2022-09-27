package com.smalaca.productsale.api.product;


import com.smalaca.productsale.command.domain.product.ProductAddUseCase;
import com.smalaca.productsale.query.product.ProductDetailsDto;
import com.smalaca.productsale.query.product.ProductQueryService;

import java.util.UUID;

public class ProductRestController {
    private final ProductQueryService queryService;
    private final ProductAddUseCase commandService;

    public ProductRestController(ProductQueryService queryService, ProductAddUseCase commandService) {
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
