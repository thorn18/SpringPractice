package com.example.demo.Controllers;

import java.math.BigDecimal;

public class Product {
    private final String id;
    private final String description;
    private final BigDecimal price;

    public Product(final String id,
    final String description, 
    final BigDecimal price) {

        this.id = id;
        this.description=description;
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public String getId() {
        return id;
    }
    public BigDecimal getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Product [id=" + id + ", description=" + description + ", price=" + price + "]";
    }

    
}
