package com.gla.Map;
import java.util.*;
public class ShoppingCart {
    public static void main(String[] args) {

        Map<String,Double> cart = new LinkedHashMap<>();

        cart.put("Laptop",4000.0);
        cart.put("Mobile",3000.0);

        double total = 0;
        for (double price : cart.values()) total += price;

        if (total > 5000) total *= 0.9;

        System.out.println("Total: " + total);
    }
}
