package LambdaExpression.WithSingleParameter;

/* @FunctionalInterface
public interface Vehical {
    void drive(int i);
} */

public class LambdaExpWithSingleParm {
    public static void main(String[] args) {
        // Direct implement interface method into main method and call it - Old Way
        Vehical v = new Vehical() {

            @Override
            public void drive(int i) {
                System.out.println("Deive method from Main class Old Way " + "[" + i + "]");
            }
        };
        v.drive(23);

        /* 
        *   As interface is Functonal interface, we can implement the method using Lambda Expression
        *   New way with Lambda Expression
        */ 
        Vehical v1 = i -> System.out.println("Drive method from Lambda Expression " + "[" + i + "]");
        v1.drive(3);
    }
}
