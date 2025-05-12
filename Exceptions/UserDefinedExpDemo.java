package Exceptions;

class HarshException extends Exception{  // Class for user defined exception
    HarshException(String string){
        super(string);
    }
}

public class UserDefinedExpDemo {
    public static void main(String[] args) {
        int i = 20;
        int j = 1;
        int temp = 0;
        double result = 0.0;

        try{
            result = i / j;
            if(temp==0){
                throw new HarshException("Invalid input");  // Wrote a throw block to handle exception
            }
        }
        catch(HarshException e){  // Write a throw block to handle an exception
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
    }
}
