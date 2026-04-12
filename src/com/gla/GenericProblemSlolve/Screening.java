package com.gla.GenericProblemSlolve;
import java.util.*;
public class Screening {
    static void process(List<? extends JobRole> roles) {
        for (JobRole r : roles) {
            System.out.println(r.getClass().getSimpleName());
        }
    }
}
abstract class JobRole {}

class SoftwareEngineer extends JobRole {}
class DataScientist extends JobRole {}

class Resume<T extends JobRole> {
    T role;

    Resume(T role) {
        this.role = role;
    }
}