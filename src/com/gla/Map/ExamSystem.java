package com.gla.Map;
import java.util.*;

public class ExamSystem {
    public static void main(String[] args) {

        Map<String, Map<String,Integer>> data = new HashMap<>();

        Map<String,Integer> math = new HashMap<>();
        math.put("A",95);
        math.put("B",80);

        data.put("Math", math);

        for (var subject : data.keySet()) {
            Map<String,Integer> students = data.get(subject);

            int sum = 0, max = 0;
            String topper = "";

            for (var e : students.entrySet()) {
                sum += e.getValue();
                if (e.getValue() > max) {
                    max = e.getValue();
                    topper = e.getKey();
                }
            }

            System.out.println(subject + " Topper: " + topper);
            System.out.println("Average: " + sum / students.size());
        }
    }
}
