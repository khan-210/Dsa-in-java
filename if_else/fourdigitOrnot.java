import java.util.Scanner;

public class fourdigitOrnot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x > 999 && x < 10000) {
            System.out.println("4 digit");
        } else {
            System.out.println("Not 4 digit");
        }
        sc.close();
    }
}
