import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hight = scanner.nextInt();
        int bridges = scanner.nextInt();
        int[] bridgesHight = new int[bridges];
        int i = 1;

        for (int n = 0; n < bridges; n++) {
            bridgesHight[n] = scanner.nextInt();
        }

        for (int bridgeHight: bridgesHight) {
            if (hight >= bridgeHight) {
                System.out.println("Will crash on bridge " + i);
                break;
            }
            i++;
            if (i > bridges) {
                System.out.println("Will not crash");
            }
        }
    }
}