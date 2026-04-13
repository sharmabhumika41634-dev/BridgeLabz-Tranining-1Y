package com.gla.Map;
import java.util.*;
public class StudentTracker {
    public static void main(String[] args) {

        Map<String,Double> map = new TreeMap<>();

        map.put("Aman",80.0);
        map.put("Bhumika",90.0);

        map.put("Aman",85.0); // update
        map.remove("Bhumika");

        for (var e : map.entrySet()) {
            System.out.println(e);
        }
    }
}
