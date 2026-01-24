import java.util.Scanner;
import java.util.Scanner; //main line in input
public class areaofcirclewithinput {

    static void main() {
        Scanner Sc = new Scanner(System.in); //main line in input;
        System.out.println("Enter radius:" );
        int r;
        r = Sc.nextInt();
        double pi = 3.14;
        double a = pi*r*r;
        System.out.println("The area of circle is: "+a);
    }
}
