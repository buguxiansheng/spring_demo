package com.lcfc.spring_demo.entity;

import java.math.BigDecimal;

import lombok.Data;

public class Vendor_select {
    private String product_name;
    //供应商
    private String processor_vendor;
    private String ram_vendor;
    private String hard_disk_capacity_vendor;
    private String display_vendor;
    //单价
    private BigDecimal processor_price;
    private BigDecimal ram_price;
    private BigDecimal hard_disk_capacity_price;
    private BigDecimal display_price;
    //spec
    private String processor_spec;
    private String ram_spec;
    private String hard_disk_capacity_spec;
    private String display_spec;



    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProcessor_vendor() {
        return processor_vendor;
    }

    public void setProcessor_vendor(String processor_vendor) {
        this.processor_vendor = processor_vendor;
    }

    public String getRam_vendor() {
        return ram_vendor;
    }

    public void setRam_vendor(String ram_vendor) {
        this.ram_vendor = ram_vendor;
    }

    public String getHard_disk_capacity_vendor() {
        return hard_disk_capacity_vendor;
    }

    public void setHard_disk_capacity_vendor(String hard_disk_capacity_vendor) {
        this.hard_disk_capacity_vendor = hard_disk_capacity_vendor;
    }

    public String getDisplay_vendor() {
        return display_vendor;
    }

    public void setDisplay_vendor(String display_vendor) {
        this.display_vendor = display_vendor;
    }

    public BigDecimal getProcessor_price() {
        return processor_price;
    }

    public void setProcessor_price(BigDecimal processor_price) {
        this.processor_price = processor_price;
    }

    public BigDecimal getRam_price() {
        return ram_price;
    }

    public void setRam_price(BigDecimal ram_price) {
        this.ram_price = ram_price;
    }

    public BigDecimal getHard_disk_capacity_price() {
        return hard_disk_capacity_price;
    }

    public void setHard_disk_capacity_price(BigDecimal hard_disk_capacity_price) {
        this.hard_disk_capacity_price = hard_disk_capacity_price;
    }

    public BigDecimal getDisplay_price() {
        return display_price;
    }

    public void setDisplay_price(BigDecimal display_price) {
        this.display_price = display_price;
    }
    public String getProcessor_spec() {
        return processor_spec;
    }

    public void setProcessor_spec(String processor_spec) {
        this.processor_spec = processor_spec;
    }

    public String getRam_spec() {
        return ram_spec;
    }

    public void setRam_spec(String ram_spec) {
        this.ram_spec = ram_spec;
    }

    public String getHard_disk_capacity_spec() {
        return hard_disk_capacity_spec;
    }

    public void setHard_disk_capacity_spec(String hard_disk_capacity_spec) {
        this.hard_disk_capacity_spec = hard_disk_capacity_spec;
    }

    public String getDisplay_spec() {
        return display_spec;
    }

    public void setDisplay_spec(String display_spec) {
        this.display_spec = display_spec;
    }

    @Override
    public String toString() {
        return "Vendor_select [display_price=" + display_price + ", display_spec=" + display_spec + ", display_vendor="
                + display_vendor + ", hard_disk_capacity_price=" + hard_disk_capacity_price
                + ", hard_disk_capacity_spec=" + hard_disk_capacity_spec + ", hard_disk_capacity_vendor="
                + hard_disk_capacity_vendor + ", processor_price=" + processor_price + ", processor_spec="
                + processor_spec + ", processor_vendor=" + processor_vendor + ", product_name=" + product_name
                + ", ram_price=" + ram_price + ", ram_spec=" + ram_spec + ", ram_vendor=" + ram_vendor + "]";
    }
    
      
}