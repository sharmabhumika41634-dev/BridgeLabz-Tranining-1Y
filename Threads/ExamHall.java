package com.gla.Threads;

class Entry extends Thread {
    public void run() {
        System.out.println("Students entering...");
    }
}

class QuestionPaper extends Thread {
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("Question papers distributed");
        } catch (Exception e) {}
    }
}

class Attendance extends Thread {
    public void run() {
        try {
            Thread.sleep(10000);
            System.out.println("Attendance marked");
        } catch (Exception e) {}
    }
}

class Collection extends Thread {
    public void run() {
        try {
            Thread.sleep(15000);
            System.out.println("Answer sheets collected");
        } catch (Exception e) {}
    }
}
public class ExamHall {
    public static void main(String[] args) {

        Entry e = new Entry();
        QuestionPaper q = new QuestionPaper();
        Attendance a = new Attendance();
        Collection c = new Collection();

        e.setPriority(5);
        q.setPriority(10);
        a.setPriority(8);
        c.setPriority(7);

        e.start();
        q.start();
        a.start();
        c.start();
    }
}
