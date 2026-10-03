package com.misho.springBoot_1.repository;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
    public String getProduct(){
        return "Products from repository";
    }
}
