package com.example.demo;

public class StudentBean {
    private String name;
    private int roll;
    private double mark; 

    
    public StudentBean() {
    }

   
    public StudentBean(String name, int roll, double mark) {
        this.name = name;
        this.roll = roll;
        this.mark = mark;
    }

   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    
    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "StudentBean{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", mark=" + mark +
                '}';
    }
}
