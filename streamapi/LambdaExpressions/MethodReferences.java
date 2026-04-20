package com.gla.streamapi.LambdaExpressions;
import java.util.*;
public class MethodReferences {
    public static void main(String[] args) {

        List<Integer> ids = Arrays.asList(101, 102, 103);

        ids.forEach(System.out::println);
    }
}
