public class ascii {
    public static void main(String[] args) {
        char ch = 'a';
        int x = ch; // ! implicit type conversion
        System.out.println(x);
        char alpha = 'B';
        int beta = (int) alpha;// !explicit type conversion
        System.out.println(beta);
        System.out.println((int) ch);// ! explicit type conversion.

        char c = 'z';
        System.out.println((int) c);
        System.out.println((int) '3');// ! ascii value of 3 is 51
        char y = 'g';
        System.out.println(y + 0);// ! smart tariqa ascii value ka.
        System.out.println(y + y); // ! ascii value add hota hai.

        int x2 = 43;
        char ch2 = (char) x2;
        System.out.println(ch2);

        char space = ' ';
        int x3 = (char) space;
        System.out.println(x3);

    }
}
