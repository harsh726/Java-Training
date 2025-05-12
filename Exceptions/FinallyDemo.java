package Exceptions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class FinallyDemo {
    public static void main(String[] args) throws IOException {
        
        int num = 0;
        BufferedReader bf = new BufferedReader(new InputStreamReader (System.in));
        
        try {
            System.out.println("Enter integer type of data: ");
            num = Integer.parseInt(bf.readLine());
            System.out.println("Result: " + num);
        } 
        catch (Exception e) {
            System.out.println("Catch block");
        }
        finally {
            bf.close();
            System.out.println("From finally block. Resources got closed");
        }
    }
}
