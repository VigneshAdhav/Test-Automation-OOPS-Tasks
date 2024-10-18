package com.oops.flowers;

public class FlowerShop {
    public static void main(String[] args) {
        // Define flowers
        Flower rose = new Flower("Rose", 1.00);
        Flower jasmine = new Flower("Jasmine", 2.00);
        Flower lily = new Flower("Lily", 3.00);

        // Create a bouquet
        Bouquet myBouquet = new Bouquet();

        // Add flowers to the bouquet
        myBouquet.addFlower(rose);
        myBouquet.addFlower(jasmine);
        myBouquet.addFlower(lily);
        myBouquet.addFlower(rose); // Adding another rose

        // Calculate and print the total cost of the bouquet
        double totalCost = myBouquet.calculateCost();
        System.out.printf("The total cost of the bouquet is: $%.2f%n", totalCost);
    }
}
