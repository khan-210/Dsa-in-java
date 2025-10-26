import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ! simple interest formula.
        System.out.print("Enter the Total Amout: ");
        double principle = sc.nextInt();
        System.out.print("Enter the Percentage: ");
        double rate = sc.nextInt();
        System.out.print("Enter the Time: ");
        double time = sc.nextInt();

        double SI = (principle * rate * time) / 100;

        System.out.println("The simple interest is: " + SI);
        sc.close();

    }
}
