import java.util.Scanner;

public class absolute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        // ! method 1
        // if (x < 0) {
        // System.out.println(-1 * x);
        // } else {
        // System.out.println(x);
        // }
        // ! method 2
        if (x < 0) {
            x = -x;
        }
        System.out.println(x);
        sc.close();
    }
}
