package gla.com.regularExpressions;
import java.util.Scanner;
public class Validation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        if (username.matches("^[A-Za-z][A-Za-z0-9_]{4,14}$")) {
            System.out.println("Valid Username");
        } else {
            System.out.println("Invalid Username");
        }
    }
}
