package gla.com.regularExpressions;
import java.util.regex.*;
public class ExtractEmails {
    public static void main(String[] args) {
        String text = "Contact us at support@example.com and info@company.org";

        Pattern pattern = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
        Matcher matcher = pattern.matcher(text);

        System.out.println("Email Addresses:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
