public class MethodOverLoadingExample{
  int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        add obj = new add();
        System.out.println(obj.add(5, 10));
        System.out.println(obj.add(5, 10, 15));
    }
}
