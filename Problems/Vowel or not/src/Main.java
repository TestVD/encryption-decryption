import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
            var vowelsBig = "AEIOU";
            var vowelsSmall = "aeiou";
            boolean flag = false;
            for (int i = 0; i < vowelsBig.length(); i++) {
                if (ch == vowelsBig.charAt(i) || ch == vowelsSmall.charAt(i)) {
                    flag = true;
                    break;
                } else {
                    flag = false;
                }
            }
            return flag;
        }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}