package level2;
import java.util.Scanner;
public class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {

        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdrawal Successful");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount b = new BankAccount();

        System.out.print("Enter Account Holder Name: ");
        b.accountHolder = sc.nextLine();

        System.out.print("Enter Account Number: ");
        b.accountNumber = sc.nextInt();

        System.out.print("Enter Balance: ");
        b.balance = sc.nextDouble();

        System.out.print("Deposit Amount: ");
        double d = sc.nextDouble();
        b.deposit(d);

        System.out.print("Withdraw Amount: ");
        double w = sc.nextDouble();
        b.withdraw(w);

        b.displayBalance();
    }

}
