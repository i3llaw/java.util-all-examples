import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Create a scanner to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their name
        System.out.print("What is your name? ");

        // Read the user's name from the console
        String name = scanner.nextLine();

        // Greet the user by name
        System.out.println("Hello, " + name + "!");
        
        // Close the scanner
        scanner.close();
    }
}
