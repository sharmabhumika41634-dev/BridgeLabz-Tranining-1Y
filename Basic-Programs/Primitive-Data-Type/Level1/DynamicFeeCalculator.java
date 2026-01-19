  import java.util.Scanner;
   public class DynamicFeeCalculator{
    public Static void main(String[] agrs){
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter student fee (INR):");
	double fee = input,nextdouble();
	
	System.out.println("Enter discount percentage (%): ");
	double discountprecent  = input,nextdouble();
	
	double discount = fee*(discountpercent/100);
	double finalfee = fee-discount;
	
	System.Out.println("The discount amount is INR " + discount + "and final discount fee is INR " + finalfee);
	}
	}