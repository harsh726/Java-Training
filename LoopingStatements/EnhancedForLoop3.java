package LoopingStatements;

//Create class
class Students{
    int id;
    String name;
    double marks;
}
public class EnhancedForLoop3 {
    public static void main(String[] args) {
        //Create a object and assign values
        Students s1 = new Students();
        s1.id = 1;
        s1.name = "Harsh";
        s1.marks = 70;

        Students s2 = new Students();
        s2.id = 2;
        s2.name = "Ashik";
        s2.marks = 70;
        
        Students s3 = new Students();
        s3.id = 3;
        s3.name = "Lay";
        s3.marks = 70;

        //Create array type of object and assign the class object
        Students student[] = new Students[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        // Variable "s" is the referance of Student class and
        // "student" is the object of arrayObject of Student class.
        for(Students s : student){
            System.out.println(s.id + " : " + s.name + " : " + s.marks);
        }
    }
}
