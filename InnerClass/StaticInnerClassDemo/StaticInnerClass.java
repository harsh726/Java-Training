package InnerClass.StaticInnerClassDemo;
class OuterClass{  // Define Outer class
    int i = 20;
    public void outerMethodShow(){
        System.out.println("This is method of Outer class");
    }
    static class InnerClass{  // Define Inner static class
        int j = 40;
        public void innerMethodShow(){
            System.out.println("This is method of Inner class");
        }
    }
}
public class StaticInnerClass {
    public static void main(String[] args) {
        OuterClass objOuter = new OuterClass();  // Create an object of Outer class
        System.out.println("Variable from outer class : " + objOuter.i);  // Access Outer class variable
        objOuter.outerMethodShow();  // Call Outer class method
        
        OuterClass.InnerClass objInner = new OuterClass.InnerClass(); // Create an object of Static Inner class
        System.out.println("\nVariable from Inner class : " + objInner.j);  // Access Inner class variable using inner class object
        objInner.innerMethodShow();  // Call Inner class method
    }
}
