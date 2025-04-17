package AccessModifires;

import AccessModifires.Test.TestVariables;
class A{
    private int id = 50;
}
public class TestPrivate {
    private int num = 50;
    public static void main(String[] args) {
        TestVariables tv = new TestVariables();
        System.out.println(tv.privateVariable); // Can not access private variable from outside of class from defferent package

        A a = new A();
        System.out.println(a.id); // Can not access private variable from outside of class from same package

        System.out.println("num" + num); // Can not access without object creation
        TestPrivate trpv = new TestPrivate();
        System.out.println("Private variable define above the static method: " + trpv.num);
    }
}
