package com.gla.String.Level2;
import java.util.Scanner;
public class GradeCalculation {

    public static String calculateGrade(double percentage) {
        if (percentage >= 90)
            return "A+";
        else if (percentage >= 75)
            return "A";
        else if (percentage >= 60)
            return "B";
        else if (percentage >= 50)
            return "C";
        else
            return "Fail";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int maths = sc.nextInt();

        int total = physics + chemistry + maths;
        double percentage = (total / 300.0) * 100;

        System.out.println("Total: " + total);
        System.out.println("Percentage: " + Math.round(percentage * 100) / 100.0);
        System.out.println("Grade: " + calculateGrade(percentage));
    }

}
