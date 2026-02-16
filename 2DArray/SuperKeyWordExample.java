class SuperKeyWordExample{

    String name = "Bhumika";

    void show() {
        System.out.println("This is Parent class");
    }
}

class Child extends Parent {

    void display() {
        System.out.println("Child class method");
    }

    public static void main(String[] args) {

        Child c = new Child();

        c.show();      // Parent method
        c.display();   // Child method
        System.out.println(c.name);  // Parent variable
    }
}
