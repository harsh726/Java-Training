/* 
 *   In this example, we will fetch the values from the HasMap using for-loop
 */
package Collection;

import java.util.HashMap;
import java.util.Map;

public class HasMapWithForLoop {
    public static void main(String[] args) {
        // Create an object of HashMap by taking  Map class reference
        Map<String, Integer> students = new HashMap<>();
        
        // Add values in the HashMap using put() method.
        // If any key or value in String data type, we need to cover value with double quote
        students.put("Harsh", 23); 
        students.put("Ashik", 3);
        // Print values
        System.out.println("Fetch whole Map: " + students);

        // Fetch the Map-Key:Value using for-loop
        System.out.println("\n<----------Fetch the Map using for-loop---------->");
        for (String key : students.keySet()){
            System.out.println(key + " : " + students.get(key));
        }
    }
}
