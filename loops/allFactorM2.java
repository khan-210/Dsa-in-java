import java.util.Scanner;

public class allFactorM2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                if (i == num / i)
                    System.out.println(i + " ");
                else
                    System.out.println(i + "  " + num / i);
            }
        }
        sc.close();

    }
}
