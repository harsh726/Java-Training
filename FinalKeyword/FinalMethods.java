package FinalKeyword;

class Parent{
    final void show(){ // Define final method in Parent class
        System.out.println("Final method from Parent class.");
    }
}
class Child extends Parent{
    public void show(){  // ERROR: Cannot override final method
        System.out.println("Final method from Child class.");
    }
}

public class FinalMethods {
    public static void main(String[] args) {
        
    }
}
