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
public class SimpleThread {
    public static void main(String[] args) {
        A a = new A();
        a.start();

        B b = new B();
        b.start();
    }
}
