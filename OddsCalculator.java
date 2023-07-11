import java.util.Scanner;

public class SuccessChanceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of attempts and odds of success from the user
        System.out.print("Enter the number of attempts: ");
        int attempts = scanner.nextInt();

        System.out.print("Enter the odds of success (as a percentage between 0 and 100): ");
        double odds = scanner.nextDouble() / 100.0;

        // Calculate the chance of success
        double chance = 1 - Math.pow(1 - odds, attempts);

        // Convert the chance to a percentage
        int percentage = (int) (chance * 100);

        // Print the chance as a percentage
        System.out.println("The chance of success is: " + percentage + "%");
    }
}