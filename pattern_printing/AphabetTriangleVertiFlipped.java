import java.util.Scanner;

public class AphabetTriangleVertiFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // ! space loop
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print((char) (k + 64) + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
