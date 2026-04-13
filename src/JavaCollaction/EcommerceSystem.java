package gla.com.JavaCollaction;
import java.util.*;
public class EcommerceSystem {
    public static void main(String[] args) {

        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1));
        orders.add(new Order(2));
        orders.add(new Order(1)); // duplicate

        Set<Order> unique = new HashSet<>(orders);

        Queue<Order> queue = new LinkedList<>(unique);
        Stack<Order> failed = new Stack<>();

        while (!queue.isEmpty()) {
            Order o = queue.remove();

            if (o.id == 2) {
                failed.push(o);
            } else {
                System.out.println("Processed: " + o.id);
            }
        }

        while (!failed.isEmpty()) {
            System.out.println("Retry: " + failed.pop().id);
        }
    }
}
class Order {
    int id;

    Order(int id) {
        this.id = id;
    }

    public boolean equals(Object o) {
        return (o instanceof Order) && ((Order)o).id == this.id;
    }

    public int hashCode() {
        return id;
    }
}