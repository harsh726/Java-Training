package EnumDemo;
enum Laptop{

    MACBOOK(2000), ASUS(1700), DELL(1200), Surface;  // Define enum variables and assign its value
    private double price;   // Define variable that will store the values of enum variable

    private Laptop() {  // Create default constructor for empty const values
        price = 500;    // Assign default value to empty const enum variable (optional to initilize)
    }

    private Laptop(double price) {  // Create a parametrized constructor that will assign the values to enum variable
        this.price = price;
    }

    public double getPrice() {  // Use getterMethod to fetch the value of enum constants
        return price;
    }

    public void setPrice(double price) {    // Use setterMethod to set or change the value of enum constants
        this.price = price;
    }
    
}

public class EnumConstructor {
    public static void main(String[] args) {
        Laptop l = Laptop.ASUS; // Create an object of enum and store the constant value
        System.out.println("Fetch simple constant variable: " + l);

        // Fetch the enum variable and its value
        System.out.println("\nFetch the enum variable and its value: [" + l + " : " + l.getPrice() + "]");

        System.out.println("\nFetch all the constant variables and its values:");
        for(Laptop l2 : Laptop.values()){
            System.out.println("[" + l2 +" : " + l2.getPrice() + "]");
        }

        // Fetch the enum variable and its value and change it
        System.out.println("\nFetch the enum variable and its old value: [" + l + " : " + l.getPrice() + "]");
        l.setPrice(5000);
        System.out.println("Fetch the enum variable and its new value: [" + l + " : " + l.getPrice() + "]");
    }
}
