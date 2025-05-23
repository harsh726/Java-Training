/* 
 *  This is the example of For-each() method with using Consumer Interface
 */
package ForEachMethod;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachMethodWithConsumer {
    public static void main(String[] args) {
        // Create Array list and add elements in it.
        List<Integer> nums = Arrays.asList(4,564,54,45,5,36,56,58,45);
        
        // Print elements with simple way 
        System.out.println("<------All elements of Array List----->"); 
        System.out.print(" " + nums + " \n");

        // Implements Consumer Interface and make operation on array list elements in accept() method
        System.out.println("\n<------List of even number element form the list----->");
        Consumer<Integer> con = new Consumer<Integer>() {

            @Override
            public void accept(Integer n) {
                if(n%2==0)
                    System.out.print(" " + n + " ");
            }
        };
        // Pass one-by-one element of array list in for-each loop
        nums.forEach(con);
    }
}
