import java.util.Scanner;

public class smallestOfthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Num: ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd Num: ");
        int b = sc.nextInt();
        System.out.print("Enter the 3rd Num: ");
        int c = sc.nextInt();

        if (a < b) {
            if (a < c) {
                System.out.println("A is the smallest. " + a);
            } else {
                System.out.println("C is the smallest. " + c);
            }
        } else {
            if (b < c) {
                System.out.println("B is the smallest. " + b);
            } else {
                System.out.println("C is smallest. " + c);
            }
        }
        sc.close();

    }
}
