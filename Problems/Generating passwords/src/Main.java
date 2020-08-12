import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int n = scanner.nextInt();
        String pass = "";
        String letters = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < a; i++) {
            pass += letters.charAt(i % 26);
        }
        pass = pass.toUpperCase();

        for (int i = 0; i < b; i++) {
            pass += letters.charAt((a + i + 1) % 26);
        }

        for (int i = 0; i < c; i++) {
            pass += i % 10;
        }

        if (pass.length() < n) {
            int pl = pass.length();
            for (int i = 0; i < n - pl; i++) {
                pass += letters.charAt(i % 26);
            }
        }
        System.out.println(pass);
    }
}
