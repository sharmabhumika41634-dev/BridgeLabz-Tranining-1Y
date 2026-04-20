package com.gla.streamapi.StreamapiPromblemStatement;
import java.util.*;
public class StockPriceLogger {
    public static void main(String[] args) {

        List<Integer> prices = Arrays.asList(100, 200, 300);

        prices.forEach(p -> System.out.println("Price: " + p));
    }
}
