import java.util.Scanner;

public class DiceRollSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of rolls from the user
        System.out.print("Enter the number of dice rolls: ");
        int numRolls = scanner.nextInt();

        int[] rolls = new int[6];

        // Simulate rolling the dice and count the number of times each number comes up
        for (int i = 1; i <= numRolls; i++) {
            int result = rollDice(); // 1-6
            rolls[result - 1]++;
        }

        // Print the results
        for (int i = 0; i < 6; i++) {
            int number = i + 1;
            int count = rolls[i];
            double percentage = (double) count / numRolls * 100;
            System.out.println("Number of " + number + "'s: " + count + " (" + percentage + "%)");
        }
    }

    // Simulate rolling a six-sided dice and return the result
    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }
}