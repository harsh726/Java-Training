package InnerClass.AnonymousAbstractInnerClassDemo;

abstract class OuterClass{
    public void show(){
        System.out.println("This is from outer abstract class");
    }
    abstract void display();
}
public class AnonymousAbstractInnerClass {
    public static void main(String[] args) {
        OuterClass objOuter = new OuterClass(){  // Create anonymous class from abstract class
            public void show(){
                System.out.println("Calling from abstract inner class simple show method");
            }
            public void display(){
                System.out.println("Calling from abstract inner class abstract display method");
            }
        };
        objOuter.show();
        objOuter.display();
    }
}