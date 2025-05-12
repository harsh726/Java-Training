package UserInputDemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try{
            // Reading String
            System.out.print("Enter a String: ");
            String str = bf.readLine();

            // Reading int
            System.out.print("Enter an Integer: ");
            int num = Integer.parseInt(bf.readLine());

            // Reading double
            System.out.print("Enter a Double: ");
            double d = Double.parseDouble(bf.readLine());

            // Reading float
            System.out.print("Enter a Float: ");
            float f = Float.parseFloat(bf.readLine());

            // Reading long
            System.out.print("Enter a Long: ");
            long l = Long.parseLong(bf.readLine());

            // Reading boolean
            System.out.print("Enter a Boolean (true/false): ");
            boolean b = Boolean.parseBoolean(bf.readLine());

            // Reading char
            System.out.print("Enter a Character: ");
            char c = bf.readLine().charAt(0);  // read first char of the string

            System.out.println("\n<----------Display Values---------->");
            System.out.println("String: " + str);
            System.out.println("Integer: " + num);
            System.out.println("Double: " + d);
            System.out.println("Float: " + f);
            System.out.println("Long: " + l);
            System.out.println("Boolean: " + b);
            System.out.println("Character: " + c);
        }
        catch(Exception e){
            System.out.println("Error in input" + e);
        }
    }
}
