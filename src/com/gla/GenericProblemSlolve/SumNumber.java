package com.gla.GenericProblemSlolve;
import java.util.*;
public class SumNumber {
    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }
}
