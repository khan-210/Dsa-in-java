import java.util.Scanner;

public class printOnCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st side:");
        int num = sc.nextInt();
        if (num % 5 == 0 && num % 3 == 0) {
            System.out.println("divisible by 5 and 3");
        } else if (num % 5 == 0) {
            System.out.println("Divisible by 5");
        } else if (num % 3 == 0) {
            System.out.println(" divisible by 3");
        } else {
            System.out.println("Not divisible");
        }
        sc.close();

    }
}
