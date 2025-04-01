package ClassAndObject;
class Calculator2{

    // Define method with parameters
    public double addition(double n1, double n2){
        double r = n1 + n2;
        return r;
    }
}
public class ClassDemo2 {
    public static void main(String[] args) {

        // Create an object
        Calculator2 add = new Calculator2();

        // Call a method from the class Calculator by passing direct values
        double result1 = add.addition(10, 20);
        System.out.println("Result by passing direct values to parameters: " + result1);

        // Call a method from the class Calculator by passing variables
        double num1 = 5;
        double num2 = 10;
        Calculator2 add2 = new Calculator2();
        double result2 = add2.addition(num1, num2);
        System.out.println("Result by passing variables to parameters: " + result2);
    }
}