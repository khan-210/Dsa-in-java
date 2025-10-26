import java.util.Scanner;

public class integerOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        int x = (int) n;
        if (x == n) {
            System.out.println("Integer");
        } else {
            System.out.println("Not integer");
        }
        sc.close();
    }
}
