package JavaOperators;

public class RelationalOperator {
    public static void main(String[] args) {
        int x = 5, y = 6, z = 6;

        //Less than < operator
        boolean resultLT = x < y;
        System.out.println("Result of Less than operator X: " + x +" and Y: " + y + ": " + resultLT);
        //Less than equal to <= operator
        boolean resultLTE = y <= z;
        System.out.println("Result of Less than operator Y: " + y +" and Z: " + z + ": " + resultLTE);

        //Greater than < operator
        boolean resultGT = x > y;
        System.out.println("\nResult of Greater than operator X: " + x +" and Y: " + y + ": " + resultGT);
        //Greater than equal to <= operator
        boolean resultGTE = y >= z;
        System.out.println("Result of Greater than operator Y: " + y +" and Z: " + z + ": " + resultGTE);

        //Equal to == operator
        boolean resultE = x==y;
        System.out.println("\nResult of Equal to operator X: " + x +" and Y: " + y + ": " + resultE);

        //Not-Equal to !== operator
        boolean resultNE = x!=y;
        System.out.println("\nResult of Not-Equal to operator X: " + x +" and Y: " + y + ": " + resultNE);
    }
}
