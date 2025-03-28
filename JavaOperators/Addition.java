package JavaOperators;

public class Addition {
    public static void main(String[] args) {
        double num1 = 7;
        double num2 = 5;

        double result;

        //Addition
        result = num1 + num2;  //Simple Addition
        System.out.println("Addition:" + result);

        //Increment num1 by 3
        num1 = num1 + 3; //Simple way
        System.out.println("\nIncrement num1 by 3: " + num1); //Output: num1 = 10
        num1 += 3; //Shortcut way
        System.out.println("Increment num1 by 3: " + num1); 

        //Pre-increment:  First increment then store value
        System.out.println("\nMain value of num2: " + num2);
        System.out.println("After pre-increment: " + ++num2);

        //Post-increment:  First fetch the value then increment
        System.out.println("\nMain value of num2: " + num2); 
        System.out.println("After post-increment: " + num2++);
    }
}
