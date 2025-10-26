import java.util.Scanner;

public class sideOfTriangleOrnot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st side:");
        int side1 = sc.nextInt();
        System.out.println("Enter 2nd side:");
        int side2 = sc.nextInt();
        System.out.println("Enter 3rd side:");
        int side3 = sc.nextInt();

        if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
            System.out.println("Sides of Triangle true");
        } else {
            System.out.println("Not true");
        }
        sc.close();
    }
}
