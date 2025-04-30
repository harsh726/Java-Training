package InterfaceDemo.SimpleInterfaceDemo;

public interface Vehical {  // Define interface
    double PI = 3.14; // static finaly variable
    void geers();    // Define abstract method 
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
        
        Vehical v = new Car(); // Create referance of Vehical and object of Car
        v.geers(); // call method of Car 

        System.out.println(Vehical.PI); // Access interface variable
    }
}
