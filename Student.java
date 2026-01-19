  class Student{
  int id;
  String name;
  int age;
  Void displayDetails(){
  String status = "Active";
  
   System.out.println("Student name: " +name");
    System.out.println("Student Age: " +age");
	
	 }
	 }
	 public class main{
	 public static void main (String[] agrs){
	 Student S1 = new Student();
	 S1.name = "Bhumika";
	 S1.age = 17;
	 
	 s1.displayDetails();//method call;
	 }
	 }