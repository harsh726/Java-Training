package StreamAPIDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ForEachMethodWithStreamAPI {
    public static void main(String[] args) {
        // Create Array list and add elements in it.
        List<Integer> nums = Arrays.asList(4,564,54,45,5,36,56,58,45);
        
        // We can shrink code more with below if there is only one line
        System.out.println("<------All elements of Array List Using Lambda for single line----->");
        nums.forEach(n -> System.out.print(" " + n + " "));

        // Create an object of Stream Interface and store all the List elements to the Stream object
        Stream<Integer> s1 = nums.stream();

        // Display all the elements of Stream Interface using forEach() method
        System.out.println("\n<------All elements of Stream Using Lambda for single line----->");
        s1.forEach(n -> System.out.print(" " + n + " "));
    }
}
