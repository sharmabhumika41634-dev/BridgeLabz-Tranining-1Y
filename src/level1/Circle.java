package level1;
import java.util.Scanner;
public class Circle {
    double radius;

    void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area = " + area);
    }

    void circumference() {
        double c = 2 * Math.PI * radius;
        System.out.println("Circumference = " + c);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();

        System.out.print("Enter radius: ");
        c.radius = sc.nextDouble();

        c.area();
        c.circumference();
    }
}
