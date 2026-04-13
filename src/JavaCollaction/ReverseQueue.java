package gla.com.JavaCollaction;
import java.util.*;
public class ReverseQueue {
    public static void reverse(Queue<Integer> q) {
        Stack<Integer> stack = new Stack<>();

        while (!q.isEmpty()) stack.push(q.remove());
        while (!stack.isEmpty()) q.add(stack.pop());
    }
}
