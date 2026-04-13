package gla.com.JavaCollaction;
import java.util.*;
public class SubsetCheck {
    public static boolean isSubset(Set<Integer> s1, Set<Integer> s2) {
        return s2.containsAll(s1);
    }
}
