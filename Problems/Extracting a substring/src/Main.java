import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int one = scanner.nextInt();
        int two = scanner.nextInt();

        System.out.println(s.substring(one, two + 1));
    }
}