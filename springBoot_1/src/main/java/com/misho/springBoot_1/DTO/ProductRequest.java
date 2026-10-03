package com.misho.springBoot_1.DTO;


public class ProductRequest {
    private String name;
    private double price;
    private String description;

    public ProductRequest() {
    }

    public ProductRequest(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

}
