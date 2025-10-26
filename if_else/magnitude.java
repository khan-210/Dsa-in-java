import java.util.Scanner;

public class magnitude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x < 0)
            x = -x;
        if (x < 69)
            System.out.println("true");
        else
            System.out.println("false");

        sc.close();
    }
}
