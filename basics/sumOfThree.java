import java.util.Scanner;

public class sumOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first num: ");
        int num1 = sc.nextInt();
        System.out.print("enter second num: ");
        int num2 = sc.nextInt();
        System.out.print("enter third num: ");
        int num3 = sc.nextInt();

        int sum = num1 + num2 + num3;
        System.out.println("the sum is : " + sum);
        sc.close();

    }
}
