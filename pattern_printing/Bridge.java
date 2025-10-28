import java.util.Scanner;

public class Bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        // ! first line
        for (int f = 1; f <= 2 * n + 1; f++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            // ! stars
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("* ");
            }
            // ! spaces pyraamid
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("  ");
            }
            // ! spaces pyraamid
            for (int l = 1; l <= n + 1 - i; l++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        sc.close();

    }
}
