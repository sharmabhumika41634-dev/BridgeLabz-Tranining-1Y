package com.gla.Threads;

import java.util.Random;

class Ticket extends Thread {
    int id;
    String type;

    public Ticket(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public void run() {
        Random r = new Random();
        int time = (r.nextInt(5) + 1) * 1000;

        System.out.println("Ticket " + id + " (" + type + ") started by " + getName());

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {}

        System.out.println("Ticket " + id + " completed in " + time + " ms");
    }
}
public class SupportSystem {
    public static void main(String[] args) {

        Ticket t1 = new Ticket(1, "Critical");
        Ticket t2 = new Ticket(2, "Feature");
        Ticket t3 = new Ticket(3, "Query");

        t1.setPriority(10);
        t2.setPriority(4);
        t3.setPriority(2);

        t1.start();
        t2.start();
        t3.start();
    }

}
