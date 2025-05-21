/* 
 *  In this example we will see the simple way of sorting 
 *  usimg Collection class sort() method
 */
package Collection.ComparatorVsComparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SimpleSortingWithListArrayList {
    public static void main(String[] args) {
        // Define one List<> of ArrayList<>
        List<Integer> nums = new ArrayList<>();

        // Add the elements inside the List using add() method
        nums.add(98);
        nums.add(50);
        nums.add(10);
        nums.add(5);
        nums.add(65);

        System.out.println("Usorted values: " + nums);

        // Use sort() method from Collection class and 
        // need to pass List object inside the method and we can simply print it
        Collections.sort(nums);
        System.out.println("Sorted Values: " + nums);
    }
}
