package com.gla.GenericProblemSlolve;
import java.util.*;
public class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

class AnimalPrinter {
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) {
            System.out.println(a.getClass().getSimpleName());
        }
    }
}
