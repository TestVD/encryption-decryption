import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();

        System.out.print(result + " ");

        while (result != 1){
            if (result % 2 == 0){
                result = result / 2;
            } else {
                result = result * 3 + 1;
            }
            System.out.print(result + " ");
        }
    }
}