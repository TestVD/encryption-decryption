import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        for (char ch : str.toCharArray()) {
            System.out.print(Character.toString(ch) + Character.toString(ch));
        }
    }
}