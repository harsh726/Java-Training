package Exceptions;

public class SimpleException {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        double result = 0;
        
        try {
            result  = i / j;
        } catch(ArithmeticException ae) {
            System.out.println("Number can not divided by 0 "+ " :: " + ae);
            //By adding object of exception "ae", it will print the predefined exception message
        } 
        catch (Exception e) {
            System.out.println("Error occur");
        }
        System.out.println(result);
    }
}
