package dev.aman.productservice.service;

import dev.aman.productservice.models.Product;

import java.util.List;

public interface ProductService {
    Product getSingleProduct(long productId);
    List<Product> getAllProducts();
}
