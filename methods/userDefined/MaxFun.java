public class MaxFun {
    public static void Maximum(int a, int b, int c) {
        if (a > b) {
            if (a > c)
                System.out.println(a + " is greater");
            else
                System.out.println(c + " is greater");
        } else {
            if (b > c)
                System.out.println(b + " is greater");
            else
                System.out.println(c + " is greater.");
        }
    }

    public static void main(String[] args) {
        Maximum(5, 8, 10);
    }
}
