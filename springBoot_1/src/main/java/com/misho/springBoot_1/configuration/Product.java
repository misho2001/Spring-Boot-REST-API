package com.misho.springBoot_1.configuration;

import jakarta.persistence.GeneratedValue;

public class Product {


    private long id;
    private String name;
    private double price;
    private String description;
    public Product() {
    }

    public Product(long id,String name, double price,String description) {
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
    public long getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}