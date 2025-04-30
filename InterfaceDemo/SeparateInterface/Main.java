package InterfaceDemo.SeparateInterface;

public interface Interface_1 {
    String in1 = "From Interace 1";
    void show();
}
public interface Interface_2 {
    String in2 = "From Interface 2";
    void display();
}
// Implements both the interfaces (Interface_1 and Interface_2) together in one class
public class ImplementClass implements Interface_1, Interface_2 {

    @Override
    public void show() {
        System.out.println("Call Interface 1 method show()");
        System.out.println("Variable value of Interface 1: " + Interface_1.in1);
    }

    @Override
    public void display() {
        System.out.println("Call Interface 2 method display()");
        System.out.println("Variable value of Interface 1: " + Interface_2.in2);
    }
}
public class Main {
    public static void main(String[] args) {
        ImplementClass impl = new ImplementClass();
        impl.show();
        impl.display();
    }
}
