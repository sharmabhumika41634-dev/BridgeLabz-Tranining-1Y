package com.gla.GenericProblemSlolve;
import java.util.*;
public class Cart <T>{
    List<T> items = new ArrayList<>();

    void addItem(T item) {
        items.add(item);
    }

    void removeItem(T item) {
        items.remove(item);
    }

    void displayItems() {
        System.out.println(items);
    }
}
