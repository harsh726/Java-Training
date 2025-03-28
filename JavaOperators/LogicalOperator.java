package JavaOperators;

public class LogicalOperator {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;

        //Logical AND operator &&
        if(a > b && b > c){
            System.out.println("Largest numbers among A: " + a + " B: " + b + " C: " + c + " is " + a);
        }
        else if(b > a && b > c){
            System.out.println("Largest numbers among A: " + a + " B: " + b + " C: " + c + " is " + b);
        }
        else{
            System.out.println("Largest numbers among A: " + a + " B: " + b + " C: " + c + " is " + c);
        }

        //Logical OR operator ||
        int d = 0;
        if (d < 0 || d == 0){
            System.out.println("\nDefined number D: " + d + " is either negative or zero.");
        }
        else{
            System.out.println("\nDefined number D: " + d + " is positive.");
        }

        //Logical NOT operator !
        int x = 10, y = 20;
        boolean result = x > y;
        System.out.println("\nThe correct result of X: " + x + " > Y: " + y + " is "  + result);
        System.out.println("The result of X: " + x + " > Y: " + y + " after using Logical operator NOT ! is "  + !result);
    }
}
