package AbstractKeyword;
abstract class Car{  // Parent abstract class
    public abstract void drive();
    public abstract void playMusic();

    public void fly(){
        System.out.println("Car can fly.");
    }
}
abstract class XYLO extends Car{  // Child abstract class
    public void drive(){
        System.out.println("Car can drive.");
    }
}
public class UpdatedXYLO extends XYLO {  // This class called as a "Concrete class"
    public void playMusic(){
        System.out.println("Car have music system");
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        Car c = new UpdatedXYLO();
        c.fly();
        c.drive();
        c.playMusic();
    }
}