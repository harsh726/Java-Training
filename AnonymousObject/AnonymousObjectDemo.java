package AnonymousObject;

class Student{
    int id;
    String name;

    public Student(){
        System.out.println("This is from default constructor. Object got created");
    }
    public void getData(int id, String name){
        System.out.println("[" + id + " : " + name + "]");
    }
    public void message(){
        System.out.println("\nCalled method without parameters with another object.");
    }
}

public class AnonymousObjectDemo {
    public static void main(String[] args) {
        new Student();                               // Create simple Anonymous Object
        new Student().message();                    // Create simple Anonymous Object and call method
        new Student().getData(1, "Harsh"); // Create simple Anonymous Object and call method with parameters
    }
}
