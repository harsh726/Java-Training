package Static;

class Mobile{
    int id;  //Instance or object variable
    int price;
    String brand;
    static String type; // Define emapty static variable

    public void display(){
        System.out.println("[ " + id + " : " + price + " : " + brand + " : " + type + " ]");
    }
}
public class StaticVariable {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.id = 1;
        m1.price = 2000;
        m1.brand = "Apple";
        m1.type = "Smartphone"; //Access and assign value to static variable using class object "m1"
        m1.display();

        Mobile m2 = new Mobile();
        m2.id = 2;
        m2.price = 2000;
        m2.brand = "Oppo";
        //Access and assign vale to static variable using Class and variable "Mobile class"
        // I have also change its value from "Smartphone" to "Phone"
        Mobile.type = "Phone"; 
        m2.display();

        Mobile m3 = new Mobile();
        m3.id = 3;
        m3.price = 2000;
        m3.brand = "Nokia";

        // With m3 object I did not call .type variable but 
        // still in display it will display with above updated value
        m3.display();
    }
}
