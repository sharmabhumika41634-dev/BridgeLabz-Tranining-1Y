package gla.com.JavaCollaction;
import java.util.*;
public class RotateList {
    public static <T> void rotate(List<T> list, int k) {
        for (int i = 0; i < k; i++) {
            T first = list.remove(0);
            list.add(first);
        }
    }
}
