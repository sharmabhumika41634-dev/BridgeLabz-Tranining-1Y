package com.gla.GenericProblemSlolve;
import java.util.*;
public class CopyList <T>{
    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        for (Number n : src) {
            dest.add(n);
        }
    }
}
