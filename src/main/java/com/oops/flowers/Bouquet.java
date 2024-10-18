package com.oops.flowers;

import java.util.ArrayList;
import java.util.List;

class Bouquet {
    private List<Flower> flowers;

    public Bouquet() {
        this.flowers = new ArrayList<>();
    }

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public double calculateCost() {
        double totalCost = 0;
        for (Flower flower : flowers) {
            totalCost += flower.getCost();
        }
        return totalCost;
    }

    @Override
    public String toString() {
        return "Bouquet with flowers: " + flowers;
    }
}
