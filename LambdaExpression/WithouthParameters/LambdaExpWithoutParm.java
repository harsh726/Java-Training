package LambdaExpression.WithouthParameters;

/* @FunctionalInterface
public interface Vehical {
    void drive();
}
 */
public class LambdaExpWithoutParm {
    public static void main(String[] args) {
        // Direct implement interface method into main method and call it - Old Way
        Vehical v = new Vehical() {

            @Override
            public void drive() {
                System.out.println("Deive method from Main class Old Way");
            }
        };
        v.drive();

        /* 
        *   As interface is Functonal interface, we can implement the method using Lambda Expression
        *   New way with Lambda Expression
        */ 
        Vehical v1 = () -> System.out.println("Drive method from Lambda Expression");
        v1.drive();
    }
}
