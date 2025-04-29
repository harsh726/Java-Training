package InterfaceDemo.SimpleInterfaceDemo;

public interface Vehical {  // Define interface
    public void geers();    // Define abstract method 
}
class Car implements Vehical{   // Create a child class and implement Vehical class in it

    @Override
    public void geers() {   // Implement abstract method geers() which defined in interface 
        System.out.println("Car have 4 + revers geers");
    }
    
}
public class SimpleInterface {
    public static void main(String[] args) {
        Car c = new Car();  // Create an object of child class
        c.geers();  // call abstract method
    }
}
