package gla.com.regularExpressions;
import java.util.Scanner;
public class ValidateIP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter IP Address: ");
        String ip = sc.nextLine();

        String regex = "^((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\.){3}"
                + "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])$";

        if (ip.matches(regex)) {
            System.out.println("Valid IP Address");
        } else {
            System.out.println("Invalid IP Address");
        }
    }
}
