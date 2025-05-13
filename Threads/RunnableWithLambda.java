package Threads;

public class RunnableWithLambda {
    public static void main(String[] args) {
        Runnable obj1 = () -> {
            for(int i=1; i<=5; i++){
                System.out.println("Hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable obj2 = () -> {
            for(int i=1; i<=5; i++){
                System.out.println("Hi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Create a Thread class object and pass classObjectName to the Thread constructor in the parameter
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        // Call the start() method using threadObject
        t1.start();
        t2.start();
    }
}
