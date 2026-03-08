package level1;
import java.util.Scanner;
public class MobilePhone {
    String brand;
    String model;
    double price;

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MobilePhone m = new MobilePhone();

        System.out.print("Enter Brand: ");
        m.brand = sc.nextLine();

        System.out.print("Enter Model: ");
        m.model = sc.nextLine();

        System.out.print("Enter Price: ");
        m.price = sc.nextDouble();

        m.display();
    }
}
