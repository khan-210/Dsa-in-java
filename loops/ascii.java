public class ascii {
    public static void main(String[] args) {
        int a = 65;
        // ! method 1
        for (int i = 65; i <= 90; i++) {
            System.out.println((char) i + " " + i);
        }

        // ! method 2
        for (int i = 1; i <= 26; i++) {
            System.out.println((char) a + " " + a);
            a++;
        }
    }
}
