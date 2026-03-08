package com.gla.method.Level3;
import java.util.Scanner;
public class DistanceLine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1 y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter x2 y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distance = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));

        double m = (y2-y1)/(x2-x1);
        double b = y1 - m*x1;

        System.out.println("Distance = " + distance);
        System.out.println("Line Equation: y = " + m + "x + " + b);
    }
}
