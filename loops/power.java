import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the power: ");
        int pow = sc.nextInt();
        int res = 1;
        for (int i = 1; i <= pow; i++) {
            res *= base;
        }
        System.out.println(base + " to the power " + pow + " is " + res);
        sc.close();
    }
}
