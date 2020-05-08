package com.lcfc.spring_demo.entity;



public class Product_general_cost {
    private int id;
    private double salary_cost;
    private double machine_cost;
    private double material_cost;
    private double legal_cost;
    private double environment_cost;
    private double product_cost;
    private double product_amount;
    private String product_name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary_cost() {
        return salary_cost;
    }

    public void setSalary_cost(double salary_cost) {
        this.salary_cost = salary_cost;
    }

    public double getMachine_cost() {
        return machine_cost;
    }

    public void setMachine_cost(double machine_cost) {
        this.machine_cost = machine_cost;
    }

    public double getMaterial_cost() {
        return material_cost;
    }

    public void setMaterial_cost(double material_cost) {
        this.material_cost = material_cost;
    }

    public double getLegal_cost() {
        return legal_cost;
    }

    public void setLegal_cost(double legal_cost) {
        this.legal_cost = legal_cost;
    }

    public double getEnvironment_cost() {
        return environment_cost;
    }

    public void setEnvironment_cost(double environment_cost) {
        this.environment_cost = environment_cost;
    }

    public double getProduct_cost() {
        return product_cost;
    }

    public void setProduct_cost(double product_cost) {
        this.product_cost = product_cost;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public double getProduct_amount() {
        return product_amount;
    }

    public void setProduct_amount(double product_amount) {
        this.product_amount = product_amount;
    }

    @Override
    public String toString() {
        return "Product_general_cost [environment_cost=" + environment_cost + ", id=" + id + ", legal_cost="
                + legal_cost + ", machine_cost=" + machine_cost + ", material_cost=" + material_cost
                + ", product_amount=" + product_amount + ", product_cost=" + product_cost + ", product_name="
                + product_name + ", salary_cost=" + salary_cost + "]";
    }

    
    

    

    // public int getId() {
    //     return id;
    // }

    // public void setId(int id) {
    //     this.id = id;
    // }

    // public double getSalary_cost() {
    //     return salary_cost;
    // }

    // public void setSalary_cost(double salary_cost) {
    //     this.salary_cost = salary_cost;
    // }

    // public double getMachine_cost() {
    //     return machine_cost;
    // }

    // public void setMachine_cost(double machine_cost) {
    //     this.machine_cost = machine_cost;
    // }

    // public double getMaterial_cost() {
    //     return material_cost;
    // }

    // public void setMaterial_cost(double material_cost) {
    //     this.material_cost = material_cost;
    // }

    // public double getLegal_cost() {
    //     return legal_cost;
    // }

    // public void setLegal_cost(double legal_cost) {
    //     this.legal_cost = legal_cost;
    // }



    // public String getProduct_name() {
    //     return product_name;
    // }

    // public void setProduct_name(String product_name) {
    //     this.product_name = product_name;
    // }

    // public double getEnvironment_cost() {
    //     return environment_cost;
    // }

    // public void setEnvironment_cost(double environment_cost) {
    //     this.environment_cost = environment_cost;
    // }
    // public double getProduct_cost() {
    //     return product_cost;
    // }

    // public void setProduct_cost(double product_cost) {
    //     this.product_cost = product_cost;
    // }

    

    // @Override
    // public String toString() {
    //     return "Product_general_cost [environment_cost=" + environment_cost + ", id=" + id + ", legal_cost="
    //             + legal_cost + ", machine_cost=" + machine_cost + ", material_cost=" + material_cost + ", product_cost="
    //             + product_cost + ", product_name=" + product_name + ", salary_cost=" + salary_cost + "]";
    // }

    // public Product_general_cost(double salary_cost, double machine_cost, double material_cost,
    //         double legal_cost, double environment_cost, double product_cost, String product_name) {
    //     this.salary_cost = salary_cost;
    //     this.machine_cost = machine_cost;
    //     this.material_cost = material_cost;
    //     this.legal_cost = legal_cost;
    //     this.environment_cost = environment_cost;
    //     this.product_cost = product_cost;
    //     this.product_name = product_name;
    // }

    // public Product_general_cost(int id, double salary_cost, double machine_cost, double material_cost,
    //         double legal_cost, double environment_cost, double product_cost, String product_name) {
    //     this.id = id;
    //     this.salary_cost = salary_cost;
    //     this.machine_cost = machine_cost;
    //     this.material_cost = material_cost;
    //     this.legal_cost = legal_cost;
    //     this.environment_cost = environment_cost;
    //     this.product_cost = product_cost;
    //     this.product_name = product_name;
    // }
    
    

    
}