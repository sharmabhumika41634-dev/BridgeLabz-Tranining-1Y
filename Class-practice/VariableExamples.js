class VariableExamples{ 
int id = 10;      
String name= "Jay";   

int rollNo;  

static int age =20; 

void display()   // Method
{
   String status= "Active"; 
System.out.println("Status: "+status);  
}
public static void main(String args[])  // main method
{

VariableExamples var= new VariableExamples();
var.display();  
var.rollNo= 20; 

System.out.println(age); 


}
}
