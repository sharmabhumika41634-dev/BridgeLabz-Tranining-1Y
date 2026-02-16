 public class ConstructorDemo {
 int id ;
 string name;
 int age;
 
  public constructorDemo(){   //
 System.out.println("constructorDemo program"); //
 }
  
 public class ConstructorDemo (int id, string name, int age){
 this.id = id ;
  this string = name;
  this int = age;
  }
  void display(){
  System.out.println("ID: "+id");
  System.out.println("Name: "+name");
  System.out.println("name: "+age");
  
      
    public static void main(string[] agrs){
   constructorDemo cd = new constructorDemo(id:1, name:"jay",age:25);
   }
   }