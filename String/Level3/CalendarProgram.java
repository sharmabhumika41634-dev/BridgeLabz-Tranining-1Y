package com.gla.String.Level3;
import java.util.Scanner;
public class CalendarProgram {
    static String[] months = {
            "January","February","March","April","May","June",
            "July","August","September","October","November","December"
    };

    static int[] days = {
            31,28,31,30,31,30,
            31,31,30,31,30,31
    };

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDays(int month, int year) {
        if (month == 2 && isLeapYear(year))
            return 29;
        return days[month - 1];
    }

    public static int firstDay(int month, int year) {
        int d = 1;
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (d + x + (31*m0)/12) % 7;
        return d0;
    }

    public static void displayCalendar(int month, int year) {

        System.out.println("\n   " + months[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int first = firstDay(month, year);
        int totalDays = getDays(month, year);

        for (int i = 0; i < first; i++)
            System.out.print("    ");

        for (int day = 1; day <= totalDays; day++) {
            System.out.printf("%3d ", day);
            if ((day + first) % 7 == 0)
                System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        displayCalendar(month, year);
    }
}
