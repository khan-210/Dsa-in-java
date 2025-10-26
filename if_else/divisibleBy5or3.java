import java.util.Scanner;

public class divisibleBy5or3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st num: ");
        int a = sc.nextInt();

        if (a % 5 == 0 || a % 3 == 0) {
            System.out.println("divisible by 5 or 3");
        } else {
            System.out.println("not divisible 5 or 3");
        }
        sc.close();

    }
}
