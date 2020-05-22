package com.lcfc.spring_demo.entity;

import java.math.BigDecimal;

import lombok.Data;

public class Material_spec {
    private String spec;
    private String vendor;
    private String type;
    private int amount;
    private BigDecimal price_01;
    private BigDecimal price_02;

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public BigDecimal getPrice_01() {
        return price_01;
    }

    public void setPrice_01(BigDecimal price_01) {
        this.price_01 = price_01;
    }

    public BigDecimal getPrice_02() {
        return price_02;
    }

    public void setPrice_02(BigDecimal price_02) {
        this.price_02 = price_02;
    }

    @Override
    public String toString() {
        return "Material_spec [amount=" + amount + ", price_01=" + price_01 + ", price_02=" + price_02 + ", spec="
                + spec + ", type=" + type + ", vendor=" + vendor + "]";
    }
    //重写compareTO方法，有序
    
}