package Threads;
class C implements Runnable{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("From Thread A class");
            try {
                Thread.sleep(20);  // slppe() method to make thread wait to ececution
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class D implements Runnable{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("\t\tFrom Thread B class");
            try {
                Thread.sleep(20);   // slppe() method to make thread wait to ececution
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ThreadWithRunnable {
    public static void main(String[] args) {
        //Create a reference of Runnable interface and create an object of class
        Runnable c = new C();
        Runnable d = new D();
        
        // Create a Thread class object and pass classObjectName to the Thread constructor in the parameter
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(d);

        // Call the start() method using threadObject
        t1.start();
        t2.start();
    }
}
