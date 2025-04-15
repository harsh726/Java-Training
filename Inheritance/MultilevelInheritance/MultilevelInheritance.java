package Inheritance.MultilevelInheritance;

class BasicCalc{  // Parent class
    public int add(int a, int b){
        return a + b;
    }
    public int sub(int a, int b){
        return a - b;
    }
}
class AdvancedCalc extends BasicCalc{  // Child class
    public int mul(int a, int b){
        return a * b;
    }
    public double div(double a, double b){
        return a / b;
    }
}
class SmartCalc extends AdvancedCalc{   //Sub child class 
    public double power(double a, double b){
        return Math.pow(a, b);
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        SmartCalc smrtcl = new SmartCalc(); // Create an oblect of sub child class
        int addition = smrtcl.add(10, 20);        
        int substraction = smrtcl.sub(25, 5);     //  With the object of sub child class
        int multiplication = smrtcl.mul(5, 10);   //  Access methods of child and parents class
        double division = smrtcl.div(25, 5);
        double power = smrtcl.power(2, 3);

        System.out.println("Addition: " + addition );
        System.out.println("Substraction: " + substraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division); 
        System.out.println("Power: " + power);
    }
}
