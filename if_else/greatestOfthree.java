import java.util.Scanner;

public class greatestOfthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first num: ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd num: ");
        int b = sc.nextInt();
        System.out.print("Enter the third num: ");
        int c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("A is the greatest." + a);
            } else {
                System.out.println("C is the greatest. " + c);
            }
        } else {
            if (b > c) {
                System.out.println("B is the greatest. " + b);
            } else {
                System.out.println("C is greatest. " + c);
            }
        }
        sc.close();
    }
}
