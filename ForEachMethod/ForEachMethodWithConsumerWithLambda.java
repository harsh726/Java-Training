package ForEachMethod;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachMethodWithConsumerWithLambda {
    public static void main(String[] args) {
        // Create Array list and add elements in it.
        List<Integer> nums = Arrays.asList(4,564,54,45,5,36,56,58,45);
        
        // Print elements with simple way 
        System.out.println("<------All elements of Array List----->"); 
        System.out.print(" " + nums + " ");

        // Implements Consumer Interface and make operation on array list elements in accept() method using Lambda Expresion
        System.out.println("\n<------List of even number element form the list----->");
        Consumer<Integer> con = n -> {
                if(n%2==0)
                    System.out.print(" " + n + " ");
            };
        // Pass one-by-one element of array list in for-each loop
        nums.forEach(con);

        // We can shrink code more with below if there is only one line
        System.out.println("\n<------All elements of Array List Using Lambda for single line----->");
        nums.forEach(n -> System.out.print(" " + n + " "));

        // We can shrink code more with below if there is multiple line
        System.out.println("\n<------List of even number element form the list using lambda extra shrink----->");
        nums.forEach(n -> {
            if(n%2==0)
                System.out.print(" " + n + " ");
            }
        );
    }
}
