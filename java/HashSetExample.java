import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        // 1. Create a HashSet
        HashSet<String> hs = new HashSet<>();

        // 2. Add 6 objects
        hs.add("Java");
        hs.add("Python");
        hs.add("C");
        hs.add("C++");
        hs.add("JavaScript");
        hs.add("Go");

        // 3. Print size of HashSet
        System.out.println("Size of HashSet: " + hs.size());

        // 4. Remove an element
        hs.remove("C++");

        // 5. Try to remove an element not present
        boolean removed = hs.remove("Ruby");
        System.out.println("Was 'Ruby' removed? " + removed);

        // 6. Check if element exists
        System.out.println("Contains Java? " + hs.contains("Java"));
        System.out.println("Contains Ruby? " + hs.contains("Ruby"));

        // 7. Print updated HashSet
        System.out.println("Updated HashSet: " + hs);
    }
}
