package com.gla.Threads;

class Order implements Runnable {
    int id;
    String restaurant;
    int time;

    public Order(int id, String restaurant, int time) {
        this.id = id;
        this.restaurant = restaurant;
        this.time = time;
    }

    public void run() {
        Thread t = Thread.currentThread();

        try {
            System.out.println("Order " + id + " picked up by " + t.getName());
            Thread.sleep(time * 1000);

            System.out.println("Order " + id + " in transit...");
            Thread.sleep(2000);

            System.out.println("Order " + id + " delivered!");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class DeliverySystem {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Order(1, "Dominos", 2), "Agent1");
        Thread t2 = new Thread(new Order(2, "KFC", 3), "Agent2");
        Thread t3 = new Thread(new Order(3, "Pizza Hut", 1), "Agent3");

        t1.setPriority(10); // Express
        t2.setPriority(5);
        t3.setPriority(3);

        t1.start();
        t2.start();
        t3.start();
    }
}
