import java.util.Scanner;

public class pyraamidM2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int nst = 1;
        int nsp = n - 1;
        for (int i = 1; i <= n; i++) {
            // ! space loop
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }
            nsp--;
            for (int k = 1; k <= nst; k++) {
                System.out.print("* ");
            }
            nst += 2;
            System.out.println();
        }

        sc.close();
    }
}
