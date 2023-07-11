import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList of strings
        LinkedList<String> names = new LinkedList<>();

        // Add some names to the list
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Print the contents of the list
        for (String name : names) {
            System.out.println(name);
        }
    }
}