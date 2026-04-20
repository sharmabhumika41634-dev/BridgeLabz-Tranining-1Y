package com.gla.streamapi.StreamapiPromblemStatement;

import java.util.Arrays;
import java.util.List;

public class Movies {
    public static void main(String[] args) {

        List<String> movies = Arrays.asList("A","B","C","D","E","F");

        movies.stream()
                .sorted()     // demo sorting
                .limit(5)
                .forEach(System.out::println);
    }
}

