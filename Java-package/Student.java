package com.gla.JavaPackage;

public class Student {

        String name;
        int roll;

        public Student(String name, int roll) {
            this.name = name;
            this.roll = roll;
        }

        public void display() {
            System.out.println(name);
            System.out.println(roll);
        }

}
