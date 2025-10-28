public class ReturnisMendatory {
    public static int salo(int a) {
        if (a > 5) {
            return 10;
        } else {
            return 20;
        }
    }

    public static void main(String[] args) {
        System.out.println(salo(10));
    }
}
