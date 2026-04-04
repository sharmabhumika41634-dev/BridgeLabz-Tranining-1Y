package com.gla.wrapper;

public class Primitive {
    public static void main(String[] args) {
        Double d = 45.67;

        double d1 = d;           // auto-unboxing
        int d2 = (int) (double) d; // casting

        System.out.println("double: " + d1);
        System.out.println("int: " + d2);
    }
}