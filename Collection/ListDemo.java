package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        // Create an object of ArrayList class with the referance of List class
        List<Integer> num = new ArrayList<Integer>();

        // Store the values in the ArrayList
        num.add(25);
        num.add(5632);
        num.add(2523);
        num.add(4575);
        num.add(57);
        num.add(57);

        // Fetch the value by passing index number using get() method
        System.out.println("Fetch the value by passing index number: " + num.get(3));

        // Get the index number by passing value using indexOf() method
        System.out.println("Fetch the Index number of its value: " + num.indexOf(5632));

        // List also supports duplicate values while Set only supports Unique value
        System.out.print("Print all the values from the list [ ");
        for(int n : num){
            System.out.print(n + ", ");
        }
        System.out.println("]");
    }
}
