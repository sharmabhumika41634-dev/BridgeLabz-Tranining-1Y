package com.gla.streamapi.StreamapiPromblemStatement;
import java.util.*;
public class IoTSensor {
    public static void main(String[] args) {

        List<Integer> readings = Arrays.asList(50, 120, 80);

        readings.stream()
                .filter(r -> r > 100)
                .forEach(System.out::println);
    }
}

