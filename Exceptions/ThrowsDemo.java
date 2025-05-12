package Exceptions;

class Calc{
    public void division(int a, int b) throws ArithmeticException{
        double result = a / b;
        System.out.println("Division Result: " + result);
    }
    public void addition(int a, int b) throws ArithmeticException{
        double result = a + b;
        System.out.println("Addition Result: " + result);
    }
}

public class ThrowsDemo {
    public static void main(String[] args) {
        Calc c = new Calc();
        
        try{
            c.addition(10, 25);
            c.division(20, 0);
        }
        catch (ArithmeticException e) {
            System.out.println("Number can not divided by 0 "+ " :: " + e);
            e.printStackTrace(); // This will print the trace of method calling 
        }
    }
}
