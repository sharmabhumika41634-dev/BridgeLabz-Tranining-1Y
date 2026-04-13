package gla.com.JavaCollaction;

public class CircularBuffer {
    int[] arr;
    int size, count = 0, index = 0;

    CircularBuffer(int size) {
        this.size = size;
        arr = new int[size];
    }

    void add(int x) {
        arr[index] = x;
        index = (index + 1) % size;
        if (count < size) count++;
    }

    void display() {
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
