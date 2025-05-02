package LambdaExpression.WithMultipleParameters;

/* @FunctionalInterface
public interface Vehical {
    void drive(int i, String j);
} */

public class LambdaExpWithMultiParm {
    public static void main(String[] args) {
        // Direct implement interface method into main method and call it - Old Way
        Vehical v = new Vehical() {

            @Override
            public void drive(int i, String j) {
                System.out.println("Deive method from Main class Old Way " + "[" + i + " : " + j + "]");
            }
        };
        v.drive(23, "Harsh");

        /* 
        *   As interface is Functonal interface, we can implement the method using Lambda Expression
        *   New way with Lambda Expression
        */ 
        Vehical v1 = (i, j) -> System.out.println("Drive method from Lambda Expression " + "[" + i + " : " + j + "]");
        v1.drive(3, "Ashik");
    }
}
