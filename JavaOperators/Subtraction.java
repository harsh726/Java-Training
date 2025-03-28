package JavaOperators;

public class Subtraction  {
    public static void main(String[] args) {
        double num1 = 7;
        double num2 = 5;

        double result;

        //Substraction
        result = num1 - num2;  //Simple Subtraction
        System.out.println("Subtraction:" + result);

        //Decrement num1 by 3
        num1 = num1 - 3; //Simple way
        System.out.println("\nDecrement num1 by 3: " + num1); //Output: num1 = 4
        num1 -= 3; //Shortcut way
        System.out.println("Decrement num1 by 3: " + num1); 

        //Pre-decrement:  First decrement then store value
        System.out.println("\nMain value of num2: " + num2);
        System.out.println("After pre-decrement: " + --num2);

        //Post-decrement:  First fetch the value then decrement
        System.out.println("\nMain value of num2: " + num2); 
        System.out.println("After post-decrement: " + num2--);
    }
}
