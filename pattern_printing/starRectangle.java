import java.util.Scanner;

public class starRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the no of cols: ");
        int c = sc.nextInt();

        for (int i = 1; i <= r; i++) {

            for (int j = 1; j <= c; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
