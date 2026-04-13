package com.gla.GenericProblemSlolve;

public class Fruit {}
class Apple extends Fruit {}
class Mango extends Fruit {}

class FruitBox<T extends Fruit> {
    T fruit;

    void add(T fruit) {
        this.fruit = fruit;
    }

    void display() {
        System.out.println(fruit.getClass().getSimpleName());
    }
}
