  import java.util.Scanner;
   
   public class HeightConverter{
     public Static void main(String[] agrs){
	 Scanner input = new Scanner(System.in);
	 
	 System.out.print("Enter height in centimeters(cm): ");
	 double heightcm = input.nextdouble();
	 
	 double totalInches = heightcm/2.54;
	 int feet = (int) (totalInches/12);
	 double inches = totalInches%12;
	 
	 System.out.println("Your Height in cm is " + heightcm + " while in feet is " + feet + "and inchesis " + inches);
	 }
	 }