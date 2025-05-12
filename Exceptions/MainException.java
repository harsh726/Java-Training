package Exceptions;

public class MainException {
    public static void main(String[] args) {
        String temp = null;

        int i = 1, j=5;

        try {
            System.out.println(temp.length());
            int result = i / j;
        } 
        /* catch (Exception e) {   // Will throw error
            System.out.println("Exception occured" + " :: " + e);
        } */
        catch (ArithmeticException e){
            System.out.println("Number can not devided by 0");
        }
        catch (Exception e) {
            System.out.println("Exception occured" + " :: " + e);
        }
    }
}
