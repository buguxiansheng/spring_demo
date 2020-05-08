package com.lcfc.spring_demo.entity;

public class Product_material_details {
    private String product_name;
    private String display_card;
    private String processor;
    private String ram;
    private String hard_disk_capacity;

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getDisplay_card() {
        return display_card;
    }

    public void setDisplay_card(String display_card) {
        this.display_card = display_card;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHard_disk_capacity() {
        return hard_disk_capacity;
    }

    public void setHard_disk_capacity(String hard_disk_capacity) {
        this.hard_disk_capacity = hard_disk_capacity;
    }

    @Override
    public String toString() {
        return "Product_material_details [display_card=" + display_card + ", hard_disk_capacity=" + hard_disk_capacity
                + ", processor=" + processor + ", product_name=" + product_name + ", ram=" + ram + "]";
    }   
}