package com.Collectionframework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class EmployeeMangement {
  public   static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
      System.out.println(st);
      System.out.println(st.peek());
     st.pop();
      System.out.println(st);
      System.out.println(st.peek());
      Vector<Boolean> vector= new Vector<>();

      System.out.println("...................Linked list...............");
      LinkedList<Integer> l1 = new LinkedList<>();
      l1.add(11);
      l1.add(22);
      l1.add(33);
      l1.add(44);
      System.out.println(l1);
      LinkedList<Integer> l2 =new LinkedList<>();
      l2.add(10);
      l2.add(20);
      l2.add(30);
      l2.add(40);
      System.out.println(l2);
      l1.addAll(l2);
      System.out.println(l1);

  }
}