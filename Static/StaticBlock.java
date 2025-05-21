package Static;

class Student{
    int id;
    String name;
    int std;
    static String schoolName;

    static{  // Static block called on time only
        System.out.println("########## Static Block Called ##########");
        schoolName = "Avangers";
    }

    public Student(){ // Constructor call every time when object got created
        System.out.println("\n########## Constructor called ##########");
        id = 0;
        name = "";
        std = 1;
    }

    public void display(){
        System.out.println("[ " + id + " : " + name + " : " + std + " : " + schoolName + " ]");
    }
}

public class StaticBlock {
    public static void main(String[] args) {
       Student s1 = new Student();
       s1.id = 1;
       s1.name = "Harsh";
       s1.std = 8;
       s1.display();

       Student s2 = new Student();
       s2.id = 2;
       s2.name = "Ashik";
       s2.std = 6;
       s2.display();
    }
}
