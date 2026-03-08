package level1;
import java.util.Scanner;
public class Employee {
    String name;
    int id;
    double salary;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee e = new Employee();

        System.out.print("Enter name: ");
        e.name = sc.nextLine();

        System.out.print("Enter id: ");
        e.id = sc.nextInt();

        System.out.print("Enter salary: ");
        e.salary = sc.nextDouble();

        e.display();
    }
}
