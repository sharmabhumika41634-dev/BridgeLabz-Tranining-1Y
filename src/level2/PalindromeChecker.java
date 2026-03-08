package level2;
import java.util.Scanner;
public class PalindromeChecker {
    String text;

    boolean check() {

        String rev = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            rev = rev + text.charAt(i);
        }

        return text.equals(rev);
    }

    void display() {

        if (check())
            System.out.println("Palindrome String");
        else
            System.out.println("Not Palindrome");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PalindromeChecker p = new PalindromeChecker();

        System.out.print("Enter Text: ");
        p.text = sc.next();

        p.display();
    }
}
