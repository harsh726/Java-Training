package Collection;

import java.util.TreeSet;
import java.util.Collection;
import java.util.Iterator;

public class TreeSetWithIteratorDemo {
    public static void main(String[] args) {
        // Create an object of TreeSet class with the referance of Collection class
        Collection<Integer> collectionNum = new TreeSet<Integer>();

        // Store the values in the ArrayList
        collectionNum.add(25);
        collectionNum.add(5632);
        collectionNum.add(57);
        collectionNum.add(2523);
        collectionNum.add(4575);
        collectionNum.add(57);

        // Create an object of Iterator class
        Iterator<Integer> iteratorObject = collectionNum.iterator();

        while(iteratorObject.hasNext()){
            System.out.println(iteratorObject.next());
        }
    }
}
