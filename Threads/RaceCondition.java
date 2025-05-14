package Threads;

class Counter{
    int count = 0;
    /* public void increment(){ // Simple method declaration
        count++;
    } */
   public synchronized void increment(){    // synchronized method declaration
    count++;
   }
}

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable a = () -> {
            for(int i=1; i<=1000; i++){
                c.increment();
            }
        };
        Runnable b = () -> {
            for(int i=1; i<=1000; i++){
                c.increment();
            }
        };

        // Create a Thread class object and pass classObjectName to the Thread constructor in the parameter
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        // Call the start() method using threadObject
        t1.start();
        t2.start();

        // join() method allow main thread to wait to other threads comback and join
        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}
