public class basicFun {
    public static void hello() {
        System.out.println("Hello world");
        System.out.println("First Function In Java");
    }

    public static void func2() {
        System.out.println("Function 2");
    }

    public static void func3() {
        System.out.println("Function 3");
    }

    public static void main(String[] args) {
        System.out.println("before function");
        hello();
        func3();
        func2();
    }
}