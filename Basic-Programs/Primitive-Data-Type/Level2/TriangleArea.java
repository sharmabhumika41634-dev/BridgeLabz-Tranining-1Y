import java.util.Scanner;
  public class TringleArea{
  public Statis void main(String[] agrs){
  Scanner Sc = new Scanner(System.in);
  
  System.out.println("Enter base in cm: ");
  double base = Sc.nextdouble(); 
  
  System.out.println("Enter hight in cm: ");
   double hight = Sc.nextdouble(); 
   
    double areasqcm = 0.5*base*hight;
    double areasqIn = areasqcm/(2.54*2.54);
	
	System.out.println("the Area of the tringle in sq in is: "+ areasqIn); 
	 System.out.println("The Area of the tringle in sq cm is: " +areasqcm);
	 }
	 }