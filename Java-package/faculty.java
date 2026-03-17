package com.gla.JavaPackage;

public class faculty {

        String name;
        String subject;

        public faculty(String name, String subject) {
            this.name = name;
            this.subject = subject;
        }

        public void display() {
            System.out.println(name);
            System.out.println(subject);
        }

}
