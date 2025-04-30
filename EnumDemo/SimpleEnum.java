package EnumDemo;

enum Status{    // Declare Enum type class
    RUNNING, FAILED, PENDING, SUCCESS;  // Declare enum constants
}

public class SimpleEnum {
    public static void main(String[] args) {
        Status s = Status.RUNNING;      // Create an object of enum and store the constant value
        System.out.println("Stored value of enum object: " + s);

        Status[] sArrayObj = Status.values();  // Create an array object of enum to store all the values of enum constants.
        System.out.println("Address of enum: " + sArrayObj); // Display address of enum
        System.out.println("Value of enum by index[1] value: " + sArrayObj[1]); // Display enum value using index value

        System.out.print("\nValues of Enum: ");
        for (Status s1 : sArrayObj){
            System.out.print(s1 + ", ");    // Display values of enum
        }
        System.out.println("\n\nValues and Index of Enum: ");
        for (Status s1 : sArrayObj){
            System.out.println(s1 + " : " + s1.ordinal()); // Display values and index number of enum
        }
    }
}
