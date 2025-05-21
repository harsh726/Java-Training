package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionWithDataType {
    public static void main(String[] args) {
        // Create an object of ArrayList class with the referance of Collection class
        Collection<Integer> nums = new ArrayList<Integer>();

        // Store the values in the ArrayList
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        // Fetch the values and print it
        for(int n : nums){
            System.out.println(n);
        }
    }
}
