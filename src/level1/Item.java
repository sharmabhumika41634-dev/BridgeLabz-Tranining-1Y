package level1;
import java.util.Scanner;
public class Item {
    int itemCode;
    String itemName;
    double price;

    void display(int quantity) {

        double total = price * quantity;

        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + total);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Item i = new Item();

        System.out.print("Enter Item Code: ");
        i.itemCode = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Item Name: ");
        i.itemName = sc.nextLine();

        System.out.print("Enter Price: ");
        i.price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int q = sc.nextInt();

        i.display(q);
    }
}
