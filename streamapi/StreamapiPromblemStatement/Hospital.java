package com.gla.streamapi.StreamapiPromblemStatement;

import java.util.Arrays;
import java.util.List;

public class Hospital {
    public static void main(String[] args) {

        List<String> doctors = Arrays.asList("Sunday-Cardio", "Monday-Neuro", "Saturday-Ortho");

        doctors.stream()
                .filter(d -> d.startsWith("Saturday") || d.startsWith("Sunday"))
                .sorted()
                .forEach(System.out::println);
    }
}
