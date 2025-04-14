package ThisKeyword;

class A{
    int a;
    public A() {
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
        a = 10;
        System.out.println("\n<---------- Default constructor from child class ---------->");
        System.out.println("The value of A in child class default constructor is " + a);
    }
    public B(int a){
        this(); //This prevents to call parameterized constructor from parents class and only call from child class
        System.out.println("\n<---------- Parameterized constructor from child class ---------->");
        this.a = a;
        System.out.println("The value of A in child class parameterized constructor is " + a);
    }
}

public class ThisMethod {
    public static void main(String[] args) {
        B b2 = new B(20);
    }
}
