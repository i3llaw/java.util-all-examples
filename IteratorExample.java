import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add some numbers to the list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Create an iterator for the list
        Iterator<Integer> iterator = numbers.iterator();

        // Print the contents of the list using the iterator
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}