package com.gla.GenericProblemSlolve;

public class MealGenerator {
    public static <T extends MealPlan> void generate(T meal) {
        System.out.println(meal.getClass().getSimpleName());
    }
}
interface MealPlan {}

class VegetarianMeal implements MealPlan {}
class VeganMeal implements MealPlan {}

class Meal<T extends MealPlan> {
    T plan;

    Meal(T plan) {
        this.plan = plan;
    }
}