package com.gla.Map;
import java.util.*;
public class Employee {
    String name, dept;

    Employee(String n, String d) {
        name = n;
        dept = d;
    }
}

class GroupByDept {
    public static void main(String[] args) {

        List<Employee> list = List.of(
                new Employee("Alice","HR"),
                new Employee("Bob","IT"),
                new Employee("Carol","HR")
        );

        Map<String,List<String>> map = new HashMap<>();

        for (Employee e : list) {
            map.putIfAbsent(e.dept, new ArrayList<>());
            map.get(e.dept).add(e.name);
        }

        System.out.println(map);
    }
}
