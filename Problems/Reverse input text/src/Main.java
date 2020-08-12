import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) throws Exception {
        try (Reader reader = new BufferedReader(new InputStreamReader(System.in))) {
            ArrayList<Character> chars = new ArrayList<>();
            int charAsNumber = reader.read();
            while (charAsNumber != -1) {
                chars.add((char) charAsNumber);
                charAsNumber = reader.read();
            }
            for (int i = chars.size()-1; i >= 0; i--) {
                System.out.print(chars.get(i));
            }

//            StringBuilder input = new StringBuilder(reader.readLine());
//            System.out.println(input.reverse());
        }
    }
}