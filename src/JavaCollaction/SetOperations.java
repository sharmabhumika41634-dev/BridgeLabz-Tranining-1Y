package gla.com.JavaCollaction;
import java.util.*;

public class SetOperations {
    public static void operate(Set<Integer> s1, Set<Integer> s2) {
        Set<Integer> union = new HashSet<>(s1);
        union.addAll(s2);

        Set<Integer> intersection = new HashSet<>(s1);
        intersection.retainAll(s2);

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }
}
