import java.util.Scanner;

public class divisibleBy5OrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a num: ");
        double num = sc.nextInt();
        if (num % 5 == 0) {
            System.out.println("yes divisible by 5");
        } else {
            System.out.println("Not divisible by 5");
        }
        sc.close();
    }
}
