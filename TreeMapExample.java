import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap of string keys and integer values
        TreeMap<String, Integer> grades = new TreeMap<>();

        // Add some grades to the map
        grades.put("Alice", 90);
        grades.put("Bob", 80);
        grades.put("Charlie", 95);

        // Print the highest grade
        System.out.println("Highest grade: " + grades.lastEntry().getValue());
    }
}