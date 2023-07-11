import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap of string keys and integer values
        HashMap<String, Integer> grades = new HashMap<>();

        // Add some grades to the map
        grades.put("Alice", 90);
        grades.put("Bob", 80);
        grades.put("Charlie", 95);

        // Print the grade for Bob
        System.out.println("Bob's grade: " + grades.get("Bob"));
    }
}