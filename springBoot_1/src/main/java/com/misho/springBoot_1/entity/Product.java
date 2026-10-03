package com.misho.springBoot_1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


/// ra monacemebic inaxeba monacemta bazashi///


@Entity
public class Product {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private double price;
    private String description;
    private double purchasePrice;

    public Product(Long id, String name, double price, String description, double purchasePrice) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.purchasePrice = purchasePrice;
    }

    public Long getId() {
        return id;
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

    public double getPurchasePrice() {
        return purchasePrice;
    }
}
