package com.gla.GenericProblemSlolve;
import java.util.*;
public class CourseUtil {
    static void display(List<? extends CourseType> list) {
        for (CourseType c : list) {
            System.out.println(c.getClass().getSimpleName());
        }
    }
}
abstract class CourseType {}

class ExamCourse extends CourseType {}
class AssignmentCourse extends CourseType {}

class Course<T extends CourseType> {
    T type;

    Course(T type) {
        this.type = type;
    }
}
