package UserInputDemo;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Collecting user input
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter an integer: ");
        int i = sc.nextInt();

        System.out.print("Enter a double: ");
        double d = sc.nextDouble();

        System.out.print("Enter a float: ");
        float f = sc.nextFloat();

        System.out.print("Enter a long: ");
        long l = sc.nextLong();

        System.out.print("Enter a boolean (true/false): ");
        boolean b = sc.nextBoolean();

        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);  // Read first char from input

        // Printing all values at the end
        System.out.println("\n=== Entered Values ===");
        System.out.println("String   : " + str);
        System.out.println("Integer  : " + i);
        System.out.println("Double   : " + d);
        System.out.println("Float    : " + f);
        System.out.println("Long     : " + l);
        System.out.println("Boolean  : " + b);
        System.out.println("Character: " + c);
    }
}
