package FinalKeyword;

final class Parent{  // Define Parent final class
    public void show(){
        System.out.println("This is from final Parents class");
    }
}

class Child extends Parent{  // ERROR: Getting error while extending final parents class
                            // Cannot subclass final class
    public void show(){
        System.out.println("This is from Child class");
    }
}

public class FinalClasses {
    public static void main(String[] args) {
        
    }
}
