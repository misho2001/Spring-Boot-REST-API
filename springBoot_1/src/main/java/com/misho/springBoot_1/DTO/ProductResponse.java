package com.misho.springBoot_1.DTO;

public class ProductResponse {
    private long id;
    private String name;
    private double price;
    private String description;

    public ProductResponse(long id, String name, double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public long getId() {
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
}
