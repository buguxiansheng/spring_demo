package com.lcfc.spring_demo.entity;

import java.math.BigDecimal;

public class Quatation_sheet {
    //报价单
    private String spec;
    private int amount;
    private BigDecimal price;
    private BigDecimal sum;
    private String vendor;

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    @Override
    public String toString() {
        return "Quatation_sheet [amount=" + amount + ", price=" + price + ", spec=" + spec + ", sum=" + sum
                + ", vendor=" + vendor + "]";
    }
}