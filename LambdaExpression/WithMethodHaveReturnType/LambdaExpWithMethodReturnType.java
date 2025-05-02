package LambdaExpression.WithMethodHaveReturnType;

@FunctionalInterface
public interface Calc {
    int add(int i, int j);
}

public class LambdaExpWithMethodReturnType {
    public static void main(String[] args) {
        // Direct implement interface method into main method and call it - Old Way
        Calc c = new Calc() {
            public int add(int i, int j){
                return i + j;
            }
        };
        int result = c.add(10, 20);
        System.out.println("The addition of numbers is " + result);

        /* 
        *   As interface is Functonal interface, we can implement the method using Lambda Expression
        *   New way with Lambda Expression
        */ 
        Calc c1 = (i, j) -> i + j;
        int resultLambda = c1.add(25, 30);
        System.out.println("The addition of numbers from Lambda Expression is " + resultLambda);
    }
}
