package com.misho.springBoot_1.controller;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.misho.springBoot_1.DTO.ProductRequest;
import com.misho.springBoot_1.DTO.ProductResponse;
import com.misho.springBoot_1.DTO.RegisterRequest;
import com.misho.springBoot_1.configuration.Product;
import com.misho.springBoot_1.service.ProductService;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.events.Event;

@RestController
@RequestMapping("/products")
public class ProductController {

    ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public String getProduct() {
        return productService.getProduct();
    }
    @GetMapping("/{id}")
    public ProductResponse getProduct(@PathVariable Long id) {
        return productService.getProduct(id);
    }
    @PostMapping
    public ProductResponse createProduct(@RequestBody ProductRequest request) {
        return productService.createProduct(request);
    }

    @PutMapping("/products/{id}")
    public String putProduct(@PathVariable int id,@RequestBody Product product) {
        return "product"+id+" updated: "+product.getName()+"-"+product.getPrice() ;
    }
    @DeleteMapping("/products/{id}")
    public String deleteProduct(@PathVariable int id) {
        return "product "+id+" deleted: " ;
    }


}
