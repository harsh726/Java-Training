package StreamAPIDemo.ForEachMethod;

import java.util.Arrays;
import java.util.List;

public class SimpleForEachLoopMethod {
    public static void main(String[] args) {
        /* 
         *  ******* Normal way to create a List with Array List ********
         * 
         * ***Create an object of ArrayList class with the referance of List class  *** 
         *   List<Integer> num = new ArrayList<Integer>(); 
         *  
         *   // Store the values in the ArrayList
         *   num.add(25);
         *   num.add(5632);
         *   num.add(2523);
         *   num.add(4575);
         *   num.add(57);
         *   num.add(57);
         */
        // Add elements using asList() method from Arrays class
        List<Integer> nums = Arrays.asList(4,564,54,45,5,36,56,58,45);
        System.out.println("Print elements using simple elements: " + nums);
    }
}
