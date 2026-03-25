package com.gla.Threads;
class BankAccount implements Runnable {
    String name;
    String type;

    BankAccount(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() +
                    " (" + type + ") checking balance... Priority: " +
                    Thread.currentThread().getPriority());

            try {
                Thread.sleep(2000);
            } catch (Exception e) {}

            System.out.println(name + " checked balance " + i + " times\n");
        }
    }
}
public class BankSimulation {
    public static void main(String[] args) {

        Thread t1 = new Thread(new BankAccount("Amit", "Premium"));
        Thread t2 = new Thread(new BankAccount("Riya", "Regular"));
        Thread t3 = new Thread(new BankAccount("Rahul", "Basic"));

        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(1);

        t1.start();
        t2.start();
        t3.start();
    }

}
