package LoopingStatements;

public class EnhancedForLoop2 {
    public static void main(String[] args) {
        int num[] = new int[5];
        num[0] = 645;
        num[1] = 31;
        num[2] = 3698;
        num[3] = 5654;
        num[4] = 52;
        
        //Display elemts using Enhanced for-loop
        for (int n : num){
            System.out.println(n);
        }
    }
}
