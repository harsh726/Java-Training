package Exceptions;

public class ThrowException {
    public static void main(String[] args) {
        int i = 20;
        int j = 1;
        int temp = 0;
        double result = 0.0;

        try{
            result = i / j;
            if(temp==0){
                throw new ArithmeticException("Invalid input");  // Wrote a throw block to handle exception
            }
        }
        catch(ArithmeticException e){  // Write a throw block to handle an exception
            if (i == 0) {
                result = 1 / j;
                System.out.println(e);
            }
            else{
                result = i / 1;
                System.out.println(e);
            }
            System.out.println(result + " is the default output." + e);
        }
        catch(Exception e){
            System.out.println("Unknown Exception occured. " + e);
        }
    }
}
