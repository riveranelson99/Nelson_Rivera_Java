package com.company.factory;

import java.sql.Time;
import java.util.Objects;

public class IceCream {

    String flavor;
    double salePrice;
    double productionCost;
    Time productionTime;
    String ingredients;

    public IceCream(String flavor, double salePrice, double productionCost, Time productionTime, String ingredients) {
        this.flavor = flavor;
        this.salePrice = salePrice;
        this.productionCost = productionCost;
        this.productionTime = productionTime;
        this.ingredients = ingredients;
    }

    // Non-Cookie Cutter Methods
    public void whatFlavorsWeHave(String[] flavor) {
        for (String f: flavor) {
            System.out.println("We currently have " + f + " flavor in stock.");
            // This method would ideally determine how many flavors of ALL ice cream are left in stock
        }
    }

    public void totalProfit(double salePrice, double productionCost) {
        System.out.println(salePrice - productionCost);
        // This method would determine the profit made by subtracting the sales price from production cost
    }


    // Getters
    public String getFlavor() {
        return flavor;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public double getProductionCost() {
        return productionCost;
    }

    public Time getProductionTime() {
        return productionTime;
    }

    public String getIngredients() {
        return ingredients;
    }


    // Setters
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public void setProductionCost(double productionCost) {
        this.productionCost = productionCost;
    }

    public void setProductionTime(Time productionTime) {
        this.productionTime = productionTime;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCream iceCream = (IceCream) o;
        return Double.compare(iceCream.salePrice, salePrice) == 0 && Double.compare(iceCream.productionCost, productionCost) == 0 && Objects.equals(flavor, iceCream.flavor) && Objects.equals(productionTime, iceCream.productionTime) && Objects.equals(ingredients, iceCream.ingredients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, salePrice, productionCost, productionTime, ingredients);
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", salePrice=" + salePrice +
                ", productionCost=" + productionCost +
                ", productionTime=" + productionTime +
                ", ingredients='" + ingredients + '\'' +
                '}';
    }
}
