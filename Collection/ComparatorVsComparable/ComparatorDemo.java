/* 
 *  The list is sorted using the custom comparator (com), 
 *  based on the last digit of each number (i % 10)
 */
package Collection.ComparatorVsComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        // Create an anonymous class of Comparator 
        Comparator<Integer> com = new Comparator<Integer>() {

            // Use compare method that will compare 2 elements from the List
            public int compare(Integer i, Integer j){
                // Sorting logic, if swipe happen then retirn 1 orthrwise return -1
                if(i%10 > j%10)
                    return 1;
                else
                    return -1;
            }
        };
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
        // pass List elements and Comparator object
        Collections.sort(nums, com);

        System.out.println("Sorted Values: " + nums);
    }
}
