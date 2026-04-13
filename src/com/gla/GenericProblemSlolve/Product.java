package com.gla.GenericProblemSlolve;
import java.util.*;
public class Product {
    double price;

    Product(double price) {
        this.price = price;
    }

    double getPrice() {
        return price;
    }
}

class Mobile extends Product {
    Mobile(double price) {
        super(price);
    }
}

class Laptop extends Product {
    Laptop(double price) {
        super(price);
    }
}

class PriceCalculator {
    public static double calculateTotal(List<? extends Product> items) {
        double sum = 0;
        for (Product p : items) {
            sum += p.getPrice();
        }
        return sum;
    }

}
