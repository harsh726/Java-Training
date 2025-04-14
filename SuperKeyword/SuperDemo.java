package SuperKeyword;

class A{
    int a;
    public A() {
        super(); //It will call an Object class and every class in java extends Object class
        a = 0;
        System.out.println("\n<---------- Default constructor from parent class ---------->");
        System.out.println("The value of A in parets class default constructor is " + a);
    }
    public A(int a) {
        System.out.println("\n<---------- Parameterized constructor from parent class ---------->");
        this.a = a;
        System.out.println("The value of A in Parents class parameterized constructor is " + a);
    }
}
class B extends A{
    public B(){
        super(); // It will call default constructor of parents class.
        a = 10;
        System.out.println("\n<---------- Default constructor from child class ---------->");
        System.out.println("The value of A in child class default constructor is " + a);
    }
    public B(int a){
        super(50); // To call a parameteized constructor of parents class, we must use super in child class with parameter.
        // Otherwise it will not call it autometically
        System.out.println("\n<---------- Parameterized constructor from child class ---------->");
        this.a = a;
        System.out.println("The value of A in child class parameterized constructor is " + a);
    }
}
public class SuperDemo {
    public static void main(String[] args) {
        B b1 = new B();
        //B b2 = new B(25);
    }
}
