package com.oops.pizza;

public class Base {
    private String name;
    private double cost;

    public Base(String name,double cost){
        this.name=name;
        this.cost=cost;
    }
    public double getCost(){
        return cost;
    }
    public String toString(){
        return name +"Base";
    }

}
