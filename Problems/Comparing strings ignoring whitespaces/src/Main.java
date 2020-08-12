import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        if (s1.replace(" ", "").equals(s2.replace(" ", ""))) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}