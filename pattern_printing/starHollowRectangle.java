import java.util.Scanner;

public class starHollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter value of cols: ");
        int c = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (i == 1 || j == 1 || i == r || j == c) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
