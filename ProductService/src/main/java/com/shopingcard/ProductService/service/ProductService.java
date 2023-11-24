package com.shopingcard.ProductService.service;

import com.shopingcard.ProductService.model.ProductRequest;
import com.shopingcard.ProductService.model.ProductResponse;

public interface ProductService {
    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);

    void reduceQuantity(long productId, long quantity);
}
