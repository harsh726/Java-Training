/* 
 *  In the previous way we have write seperate lines and defined seperate stream for each of the method,
 *  in this code we will write all the methods in a single line. 
 */
package StreamAPIDemo.StreamAPIMethods;

import java.util.Arrays;
import java.util.List;

public class ShortWayToCombineAllMethod {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,85,57,36,52,39,87,29);

        // Old way to use all the Stream Methods
        /*  Stream<Integer> s1 = nums.stream();
         *  Stream<Integer> s2 = s1.filter(n -> n%2==0);
         *  Stream<Integer> s3 = s2.map(n -> n*2);
         *  int result = s3.reduce(0, (c,e) -> c+e);
         *  System.out.println(result); 
        */

        // Shortest way to use all Stream methods in a single line
        int result = nums.stream()
                        .filter(n -> n%2==0)
                        .map(n -> n*2)
                        .reduce(0, (c,e) -> c+e);
        System.out.println(result);
    }
}
