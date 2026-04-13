package com.gla.Map;
import java.util.*;
public class AttendanceTracker {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("A",0); map.put("B",0); map.put("C",0);

        String[][] days = {
                {"A","B"}, {"A"}, {"B","C"}
        };

        for (String[] day : days) {
            for (String s : day) {
                map.put(s, map.get(s)+1);
            }
        }

        for (var e : map.entrySet()) {
            if (e.getValue() < 2)
                System.out.println("Low attendance: " + e.getKey());
        }
    }
}
