package com.gla.streamapi.LambdaExpressions;
import java.time.*;
import java.util.*;
public class ExpiringMemberships {
    public static void main(String[] args) {

        List<LocalDate> dates = Arrays.asList(
                LocalDate.now().plusDays(10),
                LocalDate.now().plusDays(40)
        );

        dates.stream()
                .filter(d -> d.isBefore(LocalDate.now().plusDays(30)))
                .forEach(System.out::println);
    }
}
