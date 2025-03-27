package AssignmentOperators;

public class Division {
    public static void main(String[] args) {
        double num1 = 7;
        double num2 = 5;

        double result;

        //Division
        result = num1 / num2;  //Simple Division
        System.out.println("Division:" + result);
        
        //Division num1 by 3
        num1 = num1 / 3; //Simple way
        
        //.2%f is used to keep only 2 digits after decimal point
        System.out.printf("Division num1 by 3: " + "%.2f", num1);
        num1 /= 3; //Shortcut way
        System.out.printf("\nDivision num1 by 3: " + "%.3f", num1); 
    }
}
