package com.Collectionframework;
import java.util.Stack;
public class ReverseStringUsingStack {
    public static void main(String[] args) {
        String s = "Hello";

        Stack<Character> stack = new Stack<>();

                for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }

                String rev = "";
        while (!stack.isEmpty()) {
            rev = rev + stack.pop();
        }

        System.out.println("Reversed String: " + rev);
    }
}
