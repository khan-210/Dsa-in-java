import java.util.Scanner;

public class primeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Num: ");
        int num = sc.nextInt();
        boolean flag = true; // prime
        // ! for (int i = 2; i <= Math.sqrt(num); i++) tab bhy kaam same karega
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        if (num == 1)
            System.out.println("Not Prime not composite.");
        else if (flag == true)
            System.out.println("Prime number");
        else
            System.out.println("Composite Number.");
        sc.close();
    }
}
