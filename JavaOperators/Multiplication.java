package JavaOperators;

public class Multiplication {
    public static void main(String[] args) {
        double num1 = 7;
        double num2 = 5;

        double result;

        //Multiplication
        result = num1 * num2;  //Simple Multiplication
        System.out.println("Multiplication:" + result);

        //Multiplication num1 by 3
        num1 = num1 * 3; //Simple way
        System.out.println("Multiplication num1 by 3: " + num1); //Output: num1 = 21
        num1 *= 3; //Shortcut way
        System.out.println("Multiplication num1 by 3: " + num1); 
    }
}
