package com.gla.method.Level3;
import java.util.Scanner;
public class StudentMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            int p = (int)(Math.random()*100);
            int c = (int)(Math.random()*100);
            int m = (int)(Math.random()*100);

            int total = p + c + m;
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            System.out.println("Student " + i);
            System.out.println("Physics = " + p + " Chemistry = " + c + " Maths = " + m);
            System.out.println("Total = " + total + " Avg = " + avg + " % = " + percent);
        }
    }
}
