package LoopingStatements;

public class DoWhile {
    public static void main(String[] args) {
        int i = 6;

        do{
            System.out.println("Value of i: " + i);
            i++;
        }while(i == 5); // Condition is loop body only need to execute if the value of i is 5 
                        // but here current value of is 6 
                        // but it still runs body of the loop and then check the condition.
        System.out.println("Outside of loop");
    }
}
