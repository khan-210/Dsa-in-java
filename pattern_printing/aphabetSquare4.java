import java.util.Scanner;

public class aphabetSquare4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows and cols : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int a = 64;
            for (int j = 1; j <= n; j++) {
                if (i % 2 != 0)
                    System.out.print((char) (96 + i));
                else
                    System.out.print((char) (a + i));

            }
            System.out.println();
        }
        sc.close();
    }
}
