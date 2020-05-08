package com.lcfc.spring_demo.entity;

import java.math.BigDecimal;


public class Product_make_details {
    private String product_name;
    private int product_amount;
    private String product_date;
    private int product_time_cost;
    private String client;

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getProduct_amount() {
        return product_amount;
    }

    public void setProduct_amount(int product_amount) {
        this.product_amount = product_amount;
    }

    

    public int getProduct_time_cost() {
        return product_time_cost;
    }

    public void setProduct_time_cost(int product_time_cost) {
        this.product_time_cost = product_time_cost;
    }


    public String getProduct_date() {
        return product_date;
    }

    public void setProduct_date(String product_date) {
        this.product_date = product_date;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Product_make_details [client=" + client + ", product_amount=" + product_amount + ", product_date="
                + product_date + ", product_name=" + product_name + ", product_time_cost=" + product_time_cost + "]";
    }

    

    

    
    
    
}