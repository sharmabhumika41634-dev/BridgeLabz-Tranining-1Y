import java.util.Scanner;
 public class RectangleOfPerimeter{
  public Ststic void main(String[] agrs){
    Scanner Sc = new Scanner(System.in);
	
    System.out.println("Enter the lenth of the rectangle: ");
	double length = Sc.nextdouble();
	
	System.out.println("Enter the width of the rectangle: ");
	double width = Sc.nextdouble();
	
	double perimeter = 2*(length+width);
	System.out.println("The perimeter of the rectangle is: " + perimeter);
	}
	}
	