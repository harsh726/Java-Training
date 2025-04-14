package Constructor;

class Cars{
    String name;
    String model;

    //Parameterized constructor
    public Cars(String name, String model) {
        this.name = name;
        this.model = model;
    }
    public void display(){ // Simple method to display values
        System.out.println("[ " + name + " : " + model + "]");
    }
}
public class ParameterizedConstructor {
    public static void main(String[] args) {
        Cars c1 = new Cars("Hyundai", "Senta Fe");
        c1.display();
    }
}
