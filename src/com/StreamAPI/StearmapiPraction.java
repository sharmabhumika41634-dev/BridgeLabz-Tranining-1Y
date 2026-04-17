package com.Steramapi;

interface sum{
    int add(int a, int b);
}
interface StringLength {
    int length(String s);
}
interface CheckNumbers{
    String check(int n);
}

public class StearmapiPraction {
   /* public int StringLength() {
   }(String s) ->{
          retun s.length();
    };

      (int a, int b) ->{
    int c = a+b;
    return c;
    };
  */

     public static void main(String[] args){
         //lambda expression for sum of two no.
         sum s = (int a , int b)->(a+b);
         System.out.println(s.add(10,20));
         //Lambda expression for String length.
         StringLength sl = (String a)->{return a.length();};
         System.out.println(sl.length("Hello"));
         // //Lambda expression for positive negatine.
         CheckNumbers cn = (n) -> (n > 0) ? "Positive" : (n < 0) ? "Negative" : "Zero";
         System.out.println(cn.check(10));   // Positive
         System.out.println(cn.check(-5));   // Negative
         System.out.println(cn.check(0));    // Zero
    }
}

