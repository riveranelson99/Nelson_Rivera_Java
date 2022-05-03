package com.company.pointofsale;

import java.util.Objects;

public class IceCream {

    String flavor;
    int flavors;
    double price;
    int quantity;

    public IceCream(String flavor, int flavors, double price, int quantity) {
        this.flavor = flavor;
        this.flavors = flavors;
        this.price = price;
        this.quantity = quantity;
    }

    // Non-Cookie Cutter Methods
    public void flavorsRemaining(int quantity, int flavors) {
        System.out.println(quantity - flavors);
        // Method to determine how many flavors remain after sales
    }

    public void totalCost(int flavors, int price) {
        System.out.println(flavors + price);
        // Method to determine the total cost of ice cream by combing flavor price with sales price
        // Sales prices would perhaps be indicative of size, number of scoop, waffle cone or cup, etc.
    }


    // Getters
    public String getFlavor() {
        return flavor;
    }

    public int getFlavors() {
        return flavors;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }


    // Setters
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setFlavors(int flavors) {
        this.flavors = flavors;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCream iceCream = (IceCream) o;
        return flavors == iceCream.flavors && Double.compare(iceCream.price, price) == 0 && quantity == iceCream.quantity && Objects.equals(flavor, iceCream.flavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, flavors, price, quantity);
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", flavors=" + flavors +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}