package Threads;

class A extends Thread{
    public void run(){
        for(int i=0; i<=100; i++){
            System.out.println("From Thread A class");
            try {
                Thread.sleep(20);  // slppe() method to make thread wait to ececution
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0; i<=100; i++){
            System.out.println("\t\tFrom Thread B class");
            try {
                Thread.sleep(20);   // slppe() method to make thread wait to ececution
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class SleepThread {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.start();
        try {
                Thread.sleep(2);   // slppe() method to make thread wait to ececution
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        b.start();
    }
}
