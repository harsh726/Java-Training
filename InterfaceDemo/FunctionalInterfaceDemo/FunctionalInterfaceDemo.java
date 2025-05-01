package InterfaceDemo.FunctionalInterfaceDemo;

@FunctionalInterface
public interface Vehical {
    void drive();
}
class Car implements Vehical{

    @Override
    public void drive() {
        System.out.println("Drive method from Car class");
    }
    
}
public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        // Direct implement interface method into main method and call it
        Vehical v = new Vehical() {

            @Override
            public void drive() {
                System.out.println("Deive method from Main class");
            }
        };
        v.drive();

        // Implement the interface into child class and then implement interface methods
        Car c = new Car();
        c.drive();

        // As interface is Functonal interface, we can implement the method using Lambda Expression
        Vehical v1 = () -> System.out.println("Drive method from Lambda Expression");
        v1.drive();
    }
}
