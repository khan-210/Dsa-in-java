
import java.util.Scanner;

public class printOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }

        }
        System.out.println("");
        System.out.println("Method 2");
        for (int i = 1; i <= n; i = i + 2) {
            System.out.print(i + " ");
        }

        sc.close();

    }
}
