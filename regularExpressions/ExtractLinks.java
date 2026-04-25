package gla.com.regularExpressions;
import java.util.regex.*;
public class ExtractLinks {
    public static void main(String[] args) {
        String text = "Visit https://www.google.com and http://example.org for more info.";

        Pattern pattern = Pattern.compile("https?://[a-zA-Z0-9./-]+");
        Matcher matcher = pattern.matcher(text);

        System.out.println("Links:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
