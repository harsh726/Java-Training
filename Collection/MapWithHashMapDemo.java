package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapWithHashMapDemo {
    public static void main(String[] args) {
        // Create an object of HashMap by taking  Map class reference
        Map<String, Integer> students = new HashMap<>();
        
        // Add values in the HashMap using put() method.
        // If any key or value in String data type, we need to cover value with double quote
        students.put("Harsh", 23); 
        students.put("Ashik", 3);
        // Print values
        System.out.println("\nFetch whole Map: " + students);

        // Fatch value of its key
        System.out.println("\nFetch value of passed key: " + students.get("Harsh"));

        // Fetch whole map after passing duplicate key, cannot store dupicate values
        students.put("Harsh", 45);
        // Print values 
        System.out.println("\nFetch whole Map after add duplicate key: " + students);

        // Fetch all the Key set values
        System.out.println("\nList of all the Key set: " + students.keySet());

        // Fetch al the Values 
        System.out.println("\nList of all the Values : " + students.values());
    }
}
