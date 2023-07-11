import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet of integers
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add some numbers to the set
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Print the highest number
        System.out.println("Highest number: " + numbers.last());
    }
}