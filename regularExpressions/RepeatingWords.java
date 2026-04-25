package gla.com.regularExpressions;
import java.util.regex.*;
public class RepeatingWords {
    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";

        Pattern pattern = Pattern.compile("\\b(\\w+)\\s+\\1\\b");
        Matcher matcher = pattern.matcher(text);

        System.out.println("Repeating Words:");
        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}
