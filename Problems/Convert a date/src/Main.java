import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strings = str.split("-");

        System.out.println(strings[1] + "/" + strings[2] + "/" + strings[0]);

        }
}