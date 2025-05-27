package StreamAPIDemo.StreamAPIMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterMethod {
    public static void main(String[] args) {
        // Create Array list and add elements in it.
        List<Integer> nums = Arrays.asList(2,85,57,36,52,39,87,29);

        // Create an object of Stream Interface and store all the List elements to the Stream object
        // And Display it
        Stream<Integer> s1 = nums.stream();
        System.out.println("<------Display Original Stream S1----->");
        //s1.forEach(n -> System.out.print(" " + n + " ")); // This is correct way to display Stream. 
        //  Just to avoid error use below syntax for comperision
        nums.forEach(n -> System.out.print(" " + n + " "));

        // Use filter() method to fetch even number from Stream
        Stream<Integer> s2 = s1.filter(n -> n%2==0);
        System.out.println("\n<------Display Filtered Stream S2 all the even numbers from the stream----->");
        s2.forEach(n -> System.out.print(" " + n + " "));
    }
}
