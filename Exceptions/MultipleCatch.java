package Exceptions;

public class MultipleCatch {
    public static void main(String[] args) {
        int i = 20;
        int j = 2;
        double result = 0;

        int nums[] = new int[5];
        
        try {
            result  = i / j;
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        } catch(ArithmeticException e) {
            System.out.println("Number can not divided by 0 "+ " :: " + e);
            //By adding object of exception "ae", it will print the predefined exception message
        } 
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Do not add more then 5 elements." + " :: " + e);
        }
        catch (Exception e) {
            System.out.println("Error occur");
        }
        System.out.println(result);
    }
}
