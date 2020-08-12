import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int duration = scanner.nextInt();
        int foodCostPerDay = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int costOfOneNight = scanner.nextInt();
        int totalFoodCost = foodCostPerDay * duration;
        int totalCostOfHotel = costOfOneNight * (duration - 1);
        System.out.println(flightCost * 2 + totalCostOfHotel + totalFoodCost);
    }
}