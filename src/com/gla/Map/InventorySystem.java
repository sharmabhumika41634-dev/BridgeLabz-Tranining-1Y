package com.gla.Map;
import java.util.*;
public class InventorySystem {
    public static void main(String[] args) {

        Map<String,Integer> stock = new HashMap<>();

        stock.put("Pen",10);
        stock.put("Book",5);

        stock.put("Pen", stock.get("Pen") - 10); // sold

        stock.put("Book", stock.get("Book") + 5); // restock

        for (var e : stock.entrySet()) {
            if (e.getValue() <= 0)
                System.out.println("Out of stock: " + e.getKey());
        }
    }
}
