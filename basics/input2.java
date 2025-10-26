import java.util.Scanner;

public class input2 {
    public static void main(String[] args) {
        System.out.print("Enter the radius: ");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double pi = 3.14;
        double Area = pi * radius * radius;
        System.out.println("The area is: " + Area);
        sc.close();
    }
}