package Collection.ComparatorVsComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    int age;
    String name;
    
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
}

public class ComparatorWithLambda {
    public static void main(String[] args) {
        /* Lambda expression using Comparator to sort Student objects by age in ascending order.
         * In Lambda, we also don't have to write its type, so no need to writre "...com = (Student i, Student j) -> ...":
         *      insted of that we can simply wirte "...com = (i, j) -> ..."
         * If i.age is greater than j.age, it returns 1 (i comes after j); otherwise, it returns -1 (i comes before j).
         * Since there is only one statement in the lambda function, the "return" keyword and curly braces are not required.
         * Use the line below: 
        */
        Comparator<Student> com = (i, j) -> i.age > j.age ? 1 : -1;

        // Create a List of Student type and store in ArrayList
        List<Student> stud = new ArrayList<>();
        stud.add(new Student(30, "Harsh"));
        stud.add(new Student(28, "Ashik"));
        stud.add(new Student(29, "Nidhi"));
        stud.add(new Student(36, "Sunny"));

        System.out.println("<---------Befor Sorting by age--------->");
        for(Student s : stud){
            System.out.println(s);
        }

        System.out.println("<---------After Sorting by age--------->");
        // Use sort() method from Collection class and 
        // pass List elements and Comparator object
        Collections.sort(stud, com);
         for(Student s : stud){
            System.out.println(s);
        }
    }
}
