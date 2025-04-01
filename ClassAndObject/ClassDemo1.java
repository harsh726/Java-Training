package ClassAndObject;
class Calculator{
    //Variable initilization
    double a;
    double b;

    //Define method without perameters
    public double addition(){
        return a + b;
    }
}
public class ClassDemo1 {
    public static void main(String[] args) {

        //Create an object
        Calculator add = new Calculator();

        //Access a variable defined in the class through object
        add.a = 20;
        add.b = 20;

        //Call a method from the class Calculator
        double result = add.addition();

        System.out.println(result);
    }
}
