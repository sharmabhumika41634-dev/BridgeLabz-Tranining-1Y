package gla.com.JavaCollaction;
import java.util.*;
public class ReverseList {
    public static <T> void reverse(List<T> list) {
        int start = 0, end = list.size() - 1;

        while (start < end) {
            T temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        reverse(arr);
        System.out.println(arr);

        List<Integer> link = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        reverse(link);
        System.out.println(link);
    }
}
