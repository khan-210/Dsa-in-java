import java.util.Scanner;

public class sumAndRevers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse = 0;
        int sum = 0;
        while (n != 0) {
            reverse *= 10;
            reverse += n % 10;
            sum += n % 10;
            n = n / 10;
        }
        System.out.println("The sum is: " + sum);
        System.out.println("Reverse is: " + reverse);
        sc.close();
    }
}
