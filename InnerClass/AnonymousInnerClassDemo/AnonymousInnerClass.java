package InnerClass.AnonymousInnerClassDemo;
class OuterClass{
    public void show(){
        System.out.println("This is from outer abstract class");
    }
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        OuterClass objOuter = new OuterClass(){  // Create anonymous class from abstract class
            public void show(){
                System.out.println("Calling from inner class simple show method");
            }
        };
        objOuter.show();
    }
}
