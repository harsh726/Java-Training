package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class SimpleCollectionDemo {
    public static void main(String[] args) {
        // Simple way to create an object of ArrayList without declaring its type(int, flot, etc.).
        Collection c = new ArrayList();
        
        // Add data to ArrayList
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);

        // Simple way to facth the values from the ArrayList 
        // But it is priniting object not the actual value as we did not 
        // define any data type in collection class
        System.out.println(c);
    }
}
