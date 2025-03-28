package ConditionalStatements;

public class TernaryExample {
    public static void main(String[] args) {
        int a = 10, b = 20;

        int max = (a > b) ? a : b;

        //With the Ternary operator condition, whichever number will be highest will store in "max"  variable.
        System.out.println("The maximum number among A: " + a + " and B: " + b + " is " + max);
    }
}
