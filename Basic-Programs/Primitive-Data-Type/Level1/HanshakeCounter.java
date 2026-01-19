 import java.util.Scanner;
  
  public class HandshakeCounter{
  piblic Static void main (String[] agrs){
  Scanner Sc = new Scanner(System.in);
  
  System.out.println("Enter the number of student: ");
  int numberofstudents = Scannern nextint();
  
  long handshakes = (long) numberofstudents*(numberofstudents-1)/2;
  
   System.out.println("Enter the maximum number of possible handshakes among" + numberofstudents + " student is " +handshakes );
  }
  }