/* 
 *  In this code, we will sort the Stream elements using sort() method
 *  along with StreamAPI method filter()
 */
package StreamAPIDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SortStreamElementWithStreamMethod {
    public static void main(String[] args) {
        // Create Array list and add elements in it.
        List<Integer> nums = Arrays.asList(4,564,54,45,5,36,56,58,45);

        Stream<Integer> sortedValue = nums.stream()
                                    .filter(n -> n%2==0)
                                    .sorted();
        sortedValue.forEach(n -> System.out.println(n));
    }
}
