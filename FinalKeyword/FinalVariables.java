package FinalKeyword;
class Test{
    final int i; // Final variable declared

    // Default constructor initializing final variable
    public Test(){
        i = 10;
    }
}
public class FinalVariables {
    public static void main(String[] args) {
        
        final double PI; // Define final empty variable 
        PI = 3.14; // Assign value 
        final String country = "USA"; //Define final variable with value

        PI = PI + 1; // ERROR: PI value cannot be changed as it is defined as a final

        Test t = new Test();
        
        System.out.println("The value of final variable i from Test class: " + t.i);

    }
}
