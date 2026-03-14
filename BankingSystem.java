package com.gla.Encapsulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

// Abstract BankAccount class
abstract class BankAccount implements Loanable {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    public void setHolderName(String name) { this.holderName = name; }
    public void setBalance(double balance) { this.balance = balance; }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    public abstract double calculateInterest();

    public void displayAccountDetails() {
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + calculateInterest());
        System.out.println("----------------------");
    }
}

// SavingsAccount
class SavingsAccount extends BankAccount {

    private double interestRate = 0.04;

    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    public void applyForLoan(double amount) {
        if (calculateLoanEligibility())
            System.out.println("Loan approved for Savings Account: " + amount);
        else
            System.out.println("Loan not eligible for Savings Account.");
    }

    public boolean calculateLoanEligibility() {
        return getBalance() >= 5000;
    }
}

// CurrentAccount
class CurrentAccount extends BankAccount {

    private double interestRate = 0.02;

    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    public void applyForLoan(double amount) {
        if (calculateLoanEligibility())
            System.out.println("Loan approved for Current Account: " + amount);
        else
            System.out.println("Loan not eligible for Current Account.");
    }

    public boolean calculateLoanEligibility() {
        return getBalance() >= 10000;
    }
}
public class BankingSystem {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<BankAccount> accounts = new ArrayList<>();

        System.out.print("Enter number of accounts: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("\nAccount Number: ");
            String accNo = sc.nextLine();

            System.out.print("Holder Name: ");
            String name = sc.nextLine();

            System.out.print("Balance: ");
            double balance = sc.nextDouble();

            System.out.print("Type (1=Savings, 2=Current): ");
            int type = sc.nextInt();
            sc.nextLine();

            BankAccount acc;

            if (type == 1)
                acc = new SavingsAccount(accNo, name, balance);
            else
                acc = new CurrentAccount(accNo, name, balance);

            accounts.add(acc);
        }

        System.out.println("\n--- Account Details ---");

        for (BankAccount acc : accounts)
            acc.displayAccountDetails();

        System.out.println("\n--- Loan Application ---");

        for (BankAccount acc : accounts) {
            System.out.print("Enter loan amount for " + acc.getAccountNumber() + ": ");
            double loan = sc.nextDouble();
            acc.applyForLoan(loan);
        }

        sc.close();
    }
}
