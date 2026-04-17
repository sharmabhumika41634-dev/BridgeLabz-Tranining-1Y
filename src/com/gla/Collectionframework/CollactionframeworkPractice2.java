package com.Collectionframework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class CollactionframeworkPractice2 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        LinkedList<String> ll = new LinkedList<>();
        Vector<Double> vector = new Vector<>();
        Stack<Boolean> Stack = new Stack<>();
        al.add(11);
        al.add(22);
        al.add(33);
        al.add(44);
        System.out.println(al);
        al.remove(2);
        System.out.println();
        System.out.println(al);
        al.set(0,12);
        System.out.println(al);
        System.out.println(al.isEmpty());
        System.out.println(al.indexOf(10));
    }
}
