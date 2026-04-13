package gla.com.JavaCollaction;
import java.util.*;
public class BinaryGenerator {
    public static void generate(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("1");

        for (int i = 0; i < n; i++) {
            String s = q.remove();
            System.out.println(s);

            q.add(s + "0");
            q.add(s + "1");
        }
    }
}
