package Constructor;

class Car{
    String name;
    String model;

    //Default constructor
    public Car() {
        name = "Senta Fe";
        model = "Hyundai";
        System.out.println("Default constructor called");
    }
    public void display(){ // Simple method to display values
        System.out.println("[ " + name + " : " + model + "]");
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.display();
    }
}
