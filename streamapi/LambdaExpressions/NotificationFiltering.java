package com.gla.streamapi.LambdaExpressions;
import java.util.*;
import java.util.function.Predicate;
public class NotificationFiltering {
    public static void main(String[] args) {

        List<String> alerts = Arrays.asList("Critical", "Normal", "Emergency");

        Predicate<String> important = a -> a.equals("Critical") || a.equals("Emergency");

        alerts.stream()
                .filter(important)
                .forEach(System.out::println);
    }
}
