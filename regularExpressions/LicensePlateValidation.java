package gla.com.regularExpressions;
import java.util.Scanner;
public class LicensePlateValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter License Plate: ");
        String plate = sc.nextLine();

        if (plate.matches("^[A-Z]{2}[0-9]{4}$")) {
            System.out.println("Valid License Plate");
        } else {
            System.out.println("Invalid License Plate");
        }
    }
}
