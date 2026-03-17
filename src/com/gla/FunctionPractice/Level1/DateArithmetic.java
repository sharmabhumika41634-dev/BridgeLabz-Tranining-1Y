package com.gla.FunctionPractice.Level1;
import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {

    static LocalDate calculateDate(LocalDate date) {
        return date.plusDays(7)
                .plusMonths(1)
                .plusYears(2)
                .minusWeeks(3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date (yyyy-MM-dd): ");
        String input = sc.next();

        LocalDate date = LocalDate.parse(input);

        LocalDate result = calculateDate(date);

        System.out.println("Final Date: " + result);
    }
}
