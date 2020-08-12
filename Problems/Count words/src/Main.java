import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

class Main {
    public static void main(String[] args) throws Exception {
        try (Reader reader = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder input = new StringBuilder(((BufferedReader) reader).readLine());
            String[] words = input.toString().trim().split("\\s+");
            if (input.toString().isBlank() || words.length == 0) {
                System.out.println(0);
            } else {
                System.out.println(words.length);
            }
        }
    }
}