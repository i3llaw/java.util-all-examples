import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet of strings
        HashSet<String> colors = new HashSet<>();

        // Add some colors to the set
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        // Print the contents of the set
        for (String color : colors) {
            System.out.println(color);
        }
    }
}