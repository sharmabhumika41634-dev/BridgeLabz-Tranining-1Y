 class student {
  int id;
  String nam;
  
  student() {
  this (101, "Rishikesh");
  System.out.println("Default Construtor called");
  }
  
  student(int id, String name){
  this.id = id;
  this.name = name;
  System.out.println("parameter constructor called");
  }
  void display(){
  System.out.parameter(id + " " + name);
  }
  public static void main(String[] args){
  student s = new student();
  s.display();
  }
  }