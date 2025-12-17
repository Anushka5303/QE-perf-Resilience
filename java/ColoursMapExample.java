import java.util.HashMap;
import java.util.Map;

public class ColoursMapExample {
    public static void main(String[] args) {

        // Create a Map named colours with Integer keys and String values
        Map<Integer, String> colours = new HashMap<>();

        // Add 5 random colours
        colours.put(1, "Red");
        colours.put(2, "Blue");
        colours.put(3, "Green");
        colours.put(4, "Yellow");
        colours.put(5, "Purple");

        // Print the Map
        System.out.println("Colours Map: " + colours);

        // Remove one colour
        colours.remove(2); // removes key 2 (Blue)
        System.out.println("After removing one colour: " + colours);

        // Check if the colour green exists
        boolean hasGreen = colours.containsValue("Green");
        System.out.println("Does the map contain Green? " + hasGreen);

        // Print the size of the Map
        System.out.println("Size of the Map: " + colours.size());
    }
}
