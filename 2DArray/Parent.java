class class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    Child() {
        super();  // Parent constructor call
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        Child c = new Child();
    }
}
{
    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    Child() {
        super();  // Parent constructor call
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        Child c = new Child();
    }
}
