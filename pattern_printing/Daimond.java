import java.util.Scanner;

public class Daimond {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter N: ");
        int n = sc.nextInt();

        int nst = 1;
        int nsp = n - 1;
        for (int i = 1; i <= n; i++) {
            // ! spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }
            // ! stars
            for (int k = 1; k <= nst; k++) {
                System.out.print("* ");
            }
            nsp--;
            nst += 2;
            System.out.println();
        }
        nsp = 1;
        nst = 2 * n - 3;
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= nst; k++) {
                System.out.print("* ");
            }
            nsp++;
            nst -= 2;
            System.out.println();
        }
        sc.close();
    }

}
