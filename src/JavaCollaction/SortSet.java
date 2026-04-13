package gla.com.JavaCollaction;
import java.util.*;
public class SortSet {
    public static List<Integer> convert(Set<Integer> set) {
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
}
