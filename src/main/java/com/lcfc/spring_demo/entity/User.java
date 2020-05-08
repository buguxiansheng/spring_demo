package com.lcfc.spring_demo.entity;

public class User {
    private String empno;
    private String pass;

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return " [empno=" + empno + ", pass=" + pass + "]";
    }
    
    
    
    
}