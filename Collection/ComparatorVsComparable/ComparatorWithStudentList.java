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
public class ComparatorWithStudentList {
    public static void main(String[] args) {
        Comparator<Student> com = new Comparator<Student>() {
            public int compare(Student i, Student j){
                if(i.age > j.age)
                    return 1;
                else
                    return -1;
            }
        };

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
