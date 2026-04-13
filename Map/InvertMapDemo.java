package com.gla.Map;
import java.util.*;
public class InvertMapDemo {
    public static void main(String[] args) {

        Map<String,Integer> map = Map.of("A",1,"B",2,"C",1);
        Map<Integer,List<String>> result = new HashMap<>();

        for (var e : map.entrySet()) {
            result.putIfAbsent(e.getValue(), new ArrayList<>());
            result.get(e.getValue()).add(e.getKey());
        }

        System.out.println(result);
    }
}
