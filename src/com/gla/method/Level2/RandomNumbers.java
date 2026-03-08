package com.gla.method.Level2;

public class RandomNumbers {
    public static void main(String[] args) {

        int[] arr = new int[5];

        int sum = 0;
        int min = 9999;
        int max = 1000;

        for (int i = 0; i < 5; i++) {

            arr[i] = (int) (Math.random() * 9000) + 1000;

            System.out.println(arr[i]);

            sum += arr[i];

            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        double avg = sum / 5.0;

        System.out.println("Average = " + avg);
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
    }
}
