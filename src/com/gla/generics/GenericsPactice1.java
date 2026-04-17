package com.generics;

import com.sun.jdi.connect.TransportTimeoutException;

public class GenericsPactice1 {
    public static<T> void swap(T a, T b){
        System.out.println("Befor swapping:"+a+" "+b);
        T tem = a;
        a = b;
        b = tem;
        System.out.println("After swapping :"+a+""+b);

    }
    public static void main(String[] args){
        swap(5, 10);
        swap( "jay","veeru");
    }
}
