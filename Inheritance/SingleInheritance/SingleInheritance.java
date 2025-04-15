package Inheritance.SingleInheritance;

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
public class SingleInheritance {
    public static void main(String[] args) {
        AdvancedCalc advc = new AdvancedCalc(); // Create an oblect of child class
        int addition = advc.add(10, 20);        
        int substraction = advc.sub(25, 5);     //  With the object of child class
        int multiplication = advc.mul(5, 10);   //  Access methods of parents class
        double division = advc.div(25, 5);

        System.out.println("Addition: " + addition );
        System.out.println("Substraction: " + substraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
    }
}
