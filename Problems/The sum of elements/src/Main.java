import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (scanner.hasNext()) {
            int elem = scanner.nextInt();
            if (elem == 0) {
                break;
            } else {
                sum += elem;
            }
        }

        System.out.println(sum);
    }
}
