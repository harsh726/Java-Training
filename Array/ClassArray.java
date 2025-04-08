package Array;

//Create class
class Students{
    int id;
    String name;
    double marks;
}
public class ClassArray {
    public static void main(String[] args) {
        //Create a object and assign values
        Students s1 = new Students();
        s1.id = 1;
        s1.name = "Harsh";
        s1.marks = 70;

        Students s2 = new Students();
        s2.id = 2;
        s2.name = "Nidhi";
        s2.marks = 70;
        
        Students s3 = new Students();
        s3.id = 3;
        s3.name = "Champu";
        s3.marks = 70;

        //If we simply print the object of above class, it will not display the values but will print the address of it
        System.out.println(s1);

        //Create array type of object and assign the class object
        Students student[] = new Students[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        //Fetch the values
        for (int i=0; i<student.length; i++){
            System.out.println(student[i].id + " : " + student[i].name + " : " + student[i].marks);
        }
    }
}
