package dev.aman.productservice.service;

import dev.aman.productservice.models.Product;

import java.util.List;

public class SelfProductService implements ProductService {
    @Override
    public Product getSingleProduct(long productId) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }
}
