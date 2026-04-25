package gla.com.regularExpressions;
import java.util.Scanner;
public class ValidateCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Card Number: ");
        String card = sc.nextLine();

        String regex = "^(4|5)[0-9]{15}$";

        if (card.matches(regex)) {
            System.out.println("Valid Card");
        } else {
            System.out.println("Invalid Card");
        }
    }
}
