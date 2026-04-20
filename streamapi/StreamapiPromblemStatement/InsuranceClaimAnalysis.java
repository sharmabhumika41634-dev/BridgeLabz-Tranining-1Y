package com.gla.streamapi.StreamapiPromblemStatement;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InsuranceClaimAnalysis {
    public static void main(String[] args) {

        List<Integer> claims = Arrays.asList(1000, 2000, 3000);

        double avg = claims.stream()
                .collect(Collectors.averagingDouble(c -> c));

        System.out.println("Average: " + avg);
    }
}
