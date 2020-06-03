package com.lcfc.spring_demo.entity;

import java.math.BigDecimal;

public class Product_contrast {
    private String product_name;
    private BigDecimal price;
    private int performance;

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getPerformance() {
        return performance;
    }

    public void setPerformance(int performance) {
        this.performance = performance;
    }

    @Override
    public String toString() {
        return "Product_contrast [performance=" + performance + ", price=" + price + ", product_name=" + product_name
                + "]";
    }  
}