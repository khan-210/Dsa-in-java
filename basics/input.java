import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        System.out.print("Enter the radius: ");
        Scanner sc = new Scanner(System.in);

        double radius = sc.nextInt();
        double area = 3.14 * radius * radius;
        System.out.println("The area is: " + area);
        sc.close();
    }
}