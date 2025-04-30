package InterfaceDemo.MultipleInterfaceDemo;

public interface ParentInterface {
    String parentMessage = "This is from parent interface String Variable.";
    void parentShow();
}
public interface ChildInterface extends ParentInterface{
    String childMessage = "This is from child interface String Variable.";
    void childShow();
}
public class ChildClass implements ChildInterface{

    @Override
    public void childShow() {
        System.out.println("Call method of child interface");
    }

    @Override
    public void parentShow() {
        System.out.println("Call method of parent interface"); 
    }
    
}
public class Main {
    public static void main(String[] args) {
        ChildClass c = new ChildClass();    // Create an object of child class

        // Call parent interface method which implemented in child class
        c.parentShow();
        
        // Call child interface method which implemented in child class 
        c.childShow();

        // As interface have static final variable, we can directly call it with interface name
        System.out.println("Call ParentInterface variable with ParentInterface name: " + ParentInterface.parentMessage);
        System.out.println("Call ChildInterface variable with ChildInterface name: " + ChildInterface.childMessage);
        System.out.println("Call ParentInterface variable with ChildInterface name: " + ChildInterface.parentMessage);
    }
}
