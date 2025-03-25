package DataTypes;

public class DataTypeMain {
    public static void main(String[] args) {
        byte by = 1;
        short sh = 222;
        int num = 3333;
        long l = 4444l; //for long, need to add "l" at the end of the value.

        int num2 = 10_00_00_000;
        System.out.println(num2);

        float fl= 5.0f; //For float, need to add "f" at the end of the value.
        double dob = 5.6;

        char c1 = 'A';
        char c2 = '1'; //Character data type can be number also.
        
        c2++;
        System.out.println(c2);

        Boolean bol = true;
        Boolean bol2 = false; 
    }
}
