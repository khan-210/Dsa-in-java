import java.util.Scanner;

public class printEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        // ! method 1
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        // ! method 2
        System.out.println("Method 2");

        for (int i = 2; i <= n; i = i + 2) {
            System.out.println(i);
        }
        sc.close();
    }
}