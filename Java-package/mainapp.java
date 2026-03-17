package com.gla.JavaPackage;
public class mainapp {

        public static void main(String[] args) {
            Student s = new Student("Anushka", 101);
            faculty f = new faculty("Dr Sharma", "Java");

            s.display();
            f.display();
        }

}
