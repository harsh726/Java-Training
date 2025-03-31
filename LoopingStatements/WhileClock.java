package LoopingStatements;

public class WhileClock {
    public static void main(String[] args) {
        int day = 1;
        int seconds = 1, miniutes = 1, hours = 1;

        while(day <= 31){
            System.out.println("Day Number: " + day);
            while(hours <= 24){
                System.out.println("\tHours: " + hours);
                while(miniutes <= 60){
                    System.out.println("\t\tMiniutes: " + miniutes);
                    while (seconds <= 60) {
                        System.out.println("\t\t\tSeconds: " + seconds);
                        seconds++;
                    }
                    seconds = 1;
                    miniutes++;
                }
                miniutes = 1;
                hours++;
            }
            hours = 1;
            day++;
        }
    }
}
