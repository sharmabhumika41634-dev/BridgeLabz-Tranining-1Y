package com.generics;

import java.lang.Number;

public class Fabnocciseriesgenerics {
    public static <T> void swap(T a, T b) {
        System.out.println("Befor swapping:" + a + " " + b);
        T tem = a;
        a = b;
        b = tem;
        System.out.println("After swapping :" + a + "" + b);

    }

    public static <T> void fibo(T n) {
        int num = Integer.parseInt(n.toString());
        int a = 0, b = 1;
        System.out.println(a + "\n" + b);
        for (int i = 0; i < num; i++) {
            int sum = a + b;
            System.out.println(sum);
            a = b;
            b = sum;
        }
    }
    //Number
    public static<T extends Number> void fiboo(T n) {
        int num = n.intValue();

        int a = 0, b = 1;
        System.out.println(a + "\n" + b);
        for (int i = 0; i < num; i++) {
            int sum = a + b;
            System.out.println(sum);
            a = b;
            b = sum;
        }
    }

    public static void main(String[] args) {
        swap(5, 10);
        swap("jay", "veeru");
        fibo("7");
    }
}