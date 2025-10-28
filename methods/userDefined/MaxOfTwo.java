public class MaxOfTwo {
    public static int Max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        int x = Max(5, 6);
        System.out.println(x);
    }
}
