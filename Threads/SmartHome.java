package com.gla.Threads;

class Device implements Runnable {
    String name;
    int delay;

    public Device(String name, int delay) {
        this.name = name;
        this.delay = delay;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " running at " + System.currentTimeMillis());

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class SmartHome {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Device("Temperature Sensor", 5000));
        Thread t2 = new Thread(new Device("Security Camera", 3000));
        Thread t3 = new Thread(new Device("Light Controller", 4000));
        Thread t4 = new Thread(new Device("Door Lock", 6000));

        t1.setPriority(7);
        t2.setPriority(10);
        t3.setPriority(5);
        t4.setPriority(5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
