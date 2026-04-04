package com.gla.wrapper;
import java.util.*;
public class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        Integer obj = Integer.valueOf(num); // wrapping

        System.out.println("Primitive: " + num);
        System.out.println("Wrapper: " + obj);
    }

}
