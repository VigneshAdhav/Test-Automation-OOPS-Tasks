package com.oops.pizza;

public class PizzaShop {
    public static void main(String[] args) {
        // Define bases
        Base standardBase = new Base("Standard Base", 5.00);
        Base softBase = new Base("Soft Base", 6.00);

        // Define toppings
        Topping tomato = new Topping("Tomato", 1.00);
        Topping corn = new Topping("Corn", 0.75);
        Topping mushrooms = new Topping("Mushrooms", 1.50);

        // Create a pizza with a specific base
        Pizza myPizza = new Pizza(standardBase);

        // Add toppings
        myPizza.addTopping(tomato);
        myPizza.addTopping(corn);

        // Calculate and print the total cost
        double totalCost = myPizza.calculateCost();
        System.out.printf("The total cost of the pizza is: $%.2f%n", totalCost);
    }
}
