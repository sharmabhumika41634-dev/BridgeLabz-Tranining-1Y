package com.gla.method.Level3;
import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            int salary = (int)(Math.random()*90000)+10000;
            int service = (int)(Math.random()*10)+1;

            double bonus;

            if (service > 5)
                bonus = salary * 0.05;
            else
                bonus = salary * 0.02;

            double newSalary = salary + bonus;

            System.out.println("Employee " + i);
            System.out.println("Salary = " + salary);
            System.out.println("Years = " + service);
            System.out.println("Bonus = " + bonus);
            System.out.println("New Salary = " + newSalary);
        }
    }
}
