/* 
        Data conversion flow: 
            byte → short → int → long → float → double
*/
package TypeConversionAndCasting;

public class TypeConversion {
    public static void main(String[] args) {
        byte a = 10;
        int b = a; // byte to int
        double c = b; // int to double
        
        System.out.println("byte to int: " + b);
        System.out.println("int to double: " + c);
    }
}
