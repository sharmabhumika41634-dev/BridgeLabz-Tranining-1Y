package com.gla.method.Level3;
import java.util.Scanner;
public class CalendarProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month: ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

        if ((year%4==0 && year%100!=0) || year%400==0)
            days[1] = 29;

        System.out.println("Days in month = " + days[month-1]);
    }

}
