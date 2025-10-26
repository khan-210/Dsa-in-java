import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            sum = sum + lastDigit;
            n = n / 10;
            count++;
        }
        System.out.println("Count is : " + count);
        System.out.println("Sum is: " + sum);
        sc.close();
    }
}
