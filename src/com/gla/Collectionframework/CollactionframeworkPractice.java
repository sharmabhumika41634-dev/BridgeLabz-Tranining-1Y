package com.Collectionframework;

import java.lang.module.FindException;
import java.util.*;


public class CollactionframeworkPractice {
    public static void main(String[] args) {

       List l = new ArrayList();
        List l2 = new LinkedList();
        List l3 = new Vector();
        List l4 = new Stack();
        l.add(10);
        l.add(20);
        l.add("bhumika");
        l.add(5.55);
        System.out.println(l);
        for(int i = 0; i<l.size(); i++){
            System.out.println(l.get(i));
        }
        for(Object a : l){
            System.out.println(a);
        }
        System.out.println(l.contains(10));
       l.remove(1);
       System.out.println(l);
       System.out.println(l.isEmpty());




    }
}