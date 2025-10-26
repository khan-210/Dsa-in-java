public class increment {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(n);// 100
        System.out.println(n++);// 100
        System.out.println(++n);// 102
        System.out.println(n--);// 102
        System.out.println(--n);// 100
        int x = 10;
        int y = x++;
        System.out.println(x + " " + y);
    }
}
