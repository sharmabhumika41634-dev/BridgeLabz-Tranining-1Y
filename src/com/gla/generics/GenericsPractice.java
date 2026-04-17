package com.generics;
class Number<T>{
    T num;

    void setNumber(T num){
        this.num=num;
    }

    T getNum(){
        return num;
    }
}
public class GenericsPractice {
    public static void main(String[] args){
        Number<Integer> n1 = new Number<>();
        n1.setNumber(23);
        System.out.println(n1.getNum());
        Number<Double> n2= new Number<>();
        n2.setNumber(690.0000);
        System.out.println(n2.getNum());
    }
}
