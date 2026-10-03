package com.misho.springBoot_1.service;

import com.misho.springBoot_1.DTO.ProductRequest;
import com.misho.springBoot_1.DTO.ProductResponse;
import com.misho.springBoot_1.configuration.Product;
import com.misho.springBoot_1.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public String getProduct() {
        return productRepository.getProduct();
    }

    public ProductResponse createProduct(ProductRequest request) {

        Product product = new Product();

        product.setName(request.getName());
        product.setPrice(request.getPrice());
        product.setDescription(request.getDescription());

        return new ProductResponse(
                product.getId(),
                product.getName(),
                product.getPrice(),
                product.getDescription()
        );
    }
    public ProductResponse getProduct(Long id) {

        Product product = new Product(
                id,
                "Laptop",
                2500,
                "Gaming laptop"
        );

        return new ProductResponse(
                product.getId(),
                product.getName(),
                product.getPrice(),
                product.getDescription()
        );
    }
}