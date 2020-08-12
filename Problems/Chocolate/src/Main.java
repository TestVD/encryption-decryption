import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        if ((k % m == 0 || k % n == 0) && n * m >= k) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}