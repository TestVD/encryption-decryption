import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        String consonantStr = "bcdfghjklmnpqrstvwxz";
        int consonantCount = 0;
        int vowelsCount = 0;
        int letterCount = 0;

        for (int i = 0; i < word.length(); i++) {
            if (consonantStr.contains(String.valueOf(word.charAt(i)))) {
                vowelsCount = 0;
                consonantCount ++;
            } else {
                consonantCount = 0;
                vowelsCount ++;
            }

            if (consonantCount == 3 || vowelsCount == 3 ){
                letterCount++;
                consonantCount = 0;
                vowelsCount = 0;
                --i;
            }
        }
        System.out.println(letterCount);
    }
}