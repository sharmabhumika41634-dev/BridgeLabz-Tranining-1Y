package com.gla.streamapi.StreamapiPromblemStatement;

import java.util.Arrays;
import java.util.List;

public class TransformNames {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("ram","shyam","aman");

        names.stream()
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}

