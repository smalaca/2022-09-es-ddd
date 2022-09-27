package com.smalaca.productsale.command.domain.order;

import java.util.List;

public interface ProductRepository {
    boolean areAvailable(List<Product> products);
}
