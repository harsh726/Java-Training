package String;

public class SimpleString {
    public static void main(String[] args) {
        
        //Simple way to define string variable and assign value
        String s = "Hello world";

        //Defining by creating String class object, it is a correct way as String is a class and not a primitive data type
        String s1 = new String(); // Define empty string variable
        System.out.println("Empty string: " + s1);
        System.out.println("Display hashcode: " + s1.hashCode());
        
        String s2 = new String("Hello From String Class"); //Define string variable with value
        System.out.println("Display value of string: " + s2); //Concate two string (predefine message + value of string)

        //Another way is to concat strings are use ".concat("String" or/And anotherStringVariable)" method
        System.out.println("Concate string using .concate() method: " + s2.concat(" " + s));

        //Find a character located in particular location: "".charAt(IndexNumber)" index starts with 0 not 1
        System.out.println("Display 4th character located in s2 String: " + s2.charAt(3));

        //Compare two object of string which have same values
        String s3 = "Name";
        String s4 = "Name";
        System.out.print("Compare two object of string which have same values: ");
        System.out.print(s3 == s4);
    }
}
