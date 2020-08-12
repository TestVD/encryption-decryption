import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[8];
        for (int i = 0; i < names.length; i++) {
            names[i] = scanner.next();
        }

        for (int i = 8; i > 0; i--) {
            System.out.println(names[i - 1]);
        }
    }
}