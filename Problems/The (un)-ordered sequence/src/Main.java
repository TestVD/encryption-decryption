import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int temp = num;
        boolean asc = false;
        boolean desc = false;

        while (true) {
           num = scanner.nextInt();
           if (num == 0) {
               break;
           }

           if (temp < num) {
               asc = true;
           }

           if (temp > num) {
               desc = true;
           }
            temp = num;
        }

        System.out.println(!desc || !asc);
    }
}