package Collection;

import java.util.TreeSet;
import java.util.Set;

public class TreeSetDemo {
    public static void main(String[] args) {
        // Create an object of TreeSet class with the referance of Set class
        Set<Integer> num = new TreeSet<Integer>();

        // Store the values in the ArrayList
        num.add(25);
        num.add(5632);
        num.add(57);
        num.add(2523);
        num.add(4575);
        num.add(57);

        for (int n : num){
            System.out.println(n);
        }
    }
}
