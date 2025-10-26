import java.util.Scanner;

public class sumOfTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first num: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second num: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third num: ");
        int num3 = sc.nextInt();

        int sum = num1 + num2 + num3;
        System.out.print("The sum is ");
        System.out.println(sum);
        sc.close();

    }
}
