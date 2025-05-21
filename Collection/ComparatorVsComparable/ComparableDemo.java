package Collection.ComparatorVsComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Family implements Comparable<Family>{ // Implements Comparable interface
    int age;
    String name;

    public Family(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Family [age=" + age + ", name=" + name + "]";
    }
    // compareTo() method comes from Compaable interface
    @Override
    public int compareTo(Family that) {
        if (this.age > that.age)
            return 1;
        else
            return -1;
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        List<Family> fam = new ArrayList<>();
        fam.add(new Family(36, "Sunny"));
        fam.add(new Family(30, "Harsh"));
        fam.add(new Family(29, "Nidhi"));
        fam.add(new Family(28, "Ashik"));
        
        System.out.println("<---------Befor Sorting by age--------->");
        for(Family f : fam){
            System.out.println(f);
        }

        Collections.sort(fam);

        System.out.println("<---------After Sorting by age--------->");
        for(Family f : fam){
            System.out.println(f);
        }
    }
}
