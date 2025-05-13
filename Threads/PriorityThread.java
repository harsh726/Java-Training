package Threads;

class A extends Thread{
    public void run(){
        for(int i=0; i<=100; i++){
            System.out.println("From Thread A class");
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0; i<=100; i++){
            System.out.println("\t\tFrom Thread B class");
        }
    }
}
public class PriorityThread {
    public static void main(String[] args) {
        A a = new A();
        a.start();

        B b = new B();
        b.start();

        a.setPriority(5);   // Set thread priority manually

        a.setPriority(Thread.MAX_PRIORITY);     // Set thread priority MAX using constants
        b.setPriority(Thread.MIN_PRIORITY);     // Set thread priority MIN using constants
        a.setPriority(Thread.NORM_PRIORITY);    // Set thread priority NORM using constants
    }
}
