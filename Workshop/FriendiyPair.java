package Workshop;

import java.util.Scanner;

public class FriendiyPair {
    public static void main(String[] args) {


        int sum = 0;

        for (int i = 1; i <= sum / 2; i++) {
            if (sum % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int sum1 = sumOfDivisors(num1);
        int sum2 = sumOfDivisors(num2);

        if (sum1 == num2 && sum2 == num1) {
            System.out.println("Friendly Pair (Amicable Pair)");
        } else {
            System.out.println("Not a Friendly Pair");
        }
    }
}






