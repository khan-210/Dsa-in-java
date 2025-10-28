import java.util.Scanner;

public class alphabetSquare2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows and cols : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int a = 96;
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (a + j));
            }
            System.out.println();
        }
        sc.close();
    }
}
