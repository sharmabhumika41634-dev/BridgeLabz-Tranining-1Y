package com.gla.streamapi.LambdaExpressions;
import java.util.*;
public class NameUppercasing {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("ram", "shyam");

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
