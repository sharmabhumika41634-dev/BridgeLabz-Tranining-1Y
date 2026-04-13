package gla.com.JavaCollaction;
import java.util.*;
public class SymmetricDiff {
    public static Set<Integer> find(Set<Integer> s1, Set<Integer> s2) {
        Set<Integer> result = new HashSet<>(s1);
        result.addAll(s2);

        Set<Integer> temp = new HashSet<>(s1);
        temp.retainAll(s2);

        result.removeAll(temp);
        return result;
    }
}
