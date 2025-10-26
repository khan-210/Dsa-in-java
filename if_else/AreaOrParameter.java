import java.util.Scanner;

public class AreaOrParameter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        float len = sc.nextFloat();
        System.out.print("Enter the width of the rectangle: ");
        float wid = sc.nextFloat();

        double area = len * wid;
        double param = 2 * (len + wid);

        if (area == param) {
            System.out.println("Area and parameters are equal.");
        } else if (area > param) {
            System.out.println("Area is greater.");
        } else {
            System.out.println("Parameters is greater.");
        }
        sc.close();
    }
}
