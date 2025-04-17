package DynamicMethodDispatch;

class A {
    public void show(){
        System.out.println("From Parents Class A");
    }
}
class B extends A {
    public void show(){
        System.out.println("From Child Class B");
    }
}
    
public class DynamicMethodDispatchDemo {
    public static void main(String[] args) {
        A obj = new B(); // Referance to Child class
        obj.show();  // Output: From Child Class B

        obj = new A(); // Referance to Parents class
        obj.show(); // Output: From Parents Class A
    }
}
