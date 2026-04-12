package com.gla.GenericProblemSlolve;
import java.util.*;
public class WarehouseUtil {
    static void display(List<? extends WarehouseItem> list) {
        for (WarehouseItem item : list) {
            System.out.println(item.getClass().getSimpleName());
        }
    }
}
abstract class WarehouseItem {}

class Electronics extends WarehouseItem {}
class Groceries extends WarehouseItem {}
class Furniture extends WarehouseItem {}

class Storage<T extends WarehouseItem> {
    List<T> items = new ArrayList<>();

    void addItem(T item) {
        items.add(item);
    }

    List<T> getItems() {
        return items;
    }
}
