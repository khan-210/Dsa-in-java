import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        // !method 1
        for (int i = 2; i <= 3 * n - 1; i = i + 3) {
            System.out.println(i);
        }

        // ! method 2
        System.out.println("Method 2");
        int a = 10, d = 6;
        for (int i = 2; i <= 3 * n - 1; i = i + 3) {
            System.out.println(a);
            a = a + d;
        }
        sc.close();
    }
}
