package com.gla.Map;
import java.util.*;
public class LibrarySystem {
    public static void main(String[] args) {

        Map<String,String> map = new TreeMap<>();

        map.put("101","Java");
        map.put("102","Python");

        System.out.println(map.getOrDefault("101","Not Found"));

        map.remove("102");

        for (var e : map.entrySet()) {
            System.out.println(e);
        }
    }
}
