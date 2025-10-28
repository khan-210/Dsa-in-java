import java.util.Scanner;

public class CombAndParmutation {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the value of N: ");
        // int n = sc.nextInt();
        // System.out.println("enter the value of R: ");
        // int r = sc.nextInt();

        System.out.println(factorial(5));

    }
}