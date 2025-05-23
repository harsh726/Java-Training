package LoopingStatements;

import java.util.Arrays;
import java.util.List;

public class AllForLoopCombine {
    public static void main(String[] args) {
        int num[] = new int[5];
        num[0] = 645;
        num[1] = 31;
        num[2] = 3698;
        num[3] = 5654;
        num[4] = 52;

        // Normal for-loop
        System.out.println("<-------Normal For-Loop------->");
        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }

        // Enhanced for-loop
        System.out.println("\n<-------Enhanced For-Loop------->");
        for(int n : num){
            System.out.println(n);
        }

        // For-each() method
        System.out.println("\n<-------forEach-Loop Method------->");
        List<Integer> listNums = Arrays.asList(25,27,29,564,54,89,53);
        listNums.forEach(n -> System.out.println(n));
    }
}
