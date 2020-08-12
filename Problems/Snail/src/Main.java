import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int days = 0;
        int dayH = 0;
        while (dayH < h) {
            dayH = dayH + a;
            days = days + 1;
                if (dayH >= h) {
                    System.out.println(days);
                    break;
                } else {
                    dayH = dayH - b;
                }
        }
    }
}