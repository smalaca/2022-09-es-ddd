package com.smalaca.productsale.query.product;

import lombok.Getter;

public class ProductDetailsDto {
    private final String name;

    public ProductDetailsDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
