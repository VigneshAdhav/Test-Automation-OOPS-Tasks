package com.oops.pizza;

public class Topping {
    private String name;
    private double cost;

    public Topping(String name,double cost){
        this.name=name;
        this.cost=cost;
    }
    public double getCost(){
        return cost;
     }
     public String toString(){
        return name+"Topping";
     }

}
