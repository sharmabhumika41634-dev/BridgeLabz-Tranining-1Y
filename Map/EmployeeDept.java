package com.gla.Map;
import java.util.*;
public class EmployeeDept {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();

        map.put(1,"HR");
        map.put(2,"IT");
        map.put(3,"HR");

        map.put(2,"Finance"); // update

        Map<String,Integer> count = new HashMap<>();

        for (String dept : map.values()) {
            count.put(dept, count.getOrDefault(dept,0)+1);
        }

        System.out.println(count);
    }

}
