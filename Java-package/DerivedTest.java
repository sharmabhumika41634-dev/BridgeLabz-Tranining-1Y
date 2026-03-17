package com.gla.JavaPackage;

public class DerivedTest extends Base {

        public void testAccess() {
            System.out.println("Accessing methods from Base class:");

            publicMethod();
            protectedMethod();

        }

        public static void main(String[] args) {
            DerivedTest obj = new DerivedTest();
            obj.testAccess();
        }
    }
