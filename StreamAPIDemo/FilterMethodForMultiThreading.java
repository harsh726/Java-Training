/* 
 * if we want to perform the filtering with multiple Threads then 
 * we need to use parallelStream() method instead of stream() method.
 * 
 * WHILE WE USE parallelStream() METHOD, WE CANNOT USE sorted() METHOD BECAUSE 
 * sorted() METHOD NEEDS TO ACCESS ALL THE ELEMENTS DURING THE EXECUTION. 
 */
package StreamAPIDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterMethodForMultiThreading {
    public static void main(String[] args) {
        // Create Array list and add elements in it.
        List<Integer> nums = Arrays.asList(4,564,54,45,5,36,56,58,45);

        Stream<Integer> psralleStream = nums.parallelStream()
                                    .filter(n -> n%2==0);
        psralleStream.forEach(n -> System.out.println(n));
    }
}
