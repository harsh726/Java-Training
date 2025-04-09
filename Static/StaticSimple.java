package Static;

class MobilePhone{
    int price;
    String brand;
    static String name;

    public void nonStaticShow(){
        System.out.println("######### From non-Static Method #########");
        System.out.println("[ " + price + " : " + brand + " : " + name + " ]");
    }

    public static void staticShow(MobilePhone obj){
        System.out.println("\n######### From Static Method #########");
        System.out.println("[ " + obj.price + " : " + obj.brand + " : " + name + " ]");
    }
}

public class StaticSimple {
    public static void main(String[] args) {
        MobilePhone m1 = new MobilePhone();
        m1.price = 2000;
        m1.brand = "Apple";
        MobilePhone.name = "Smartphone";
        m1.nonStaticShow();

        MobilePhone m2 = new MobilePhone();
        m2.price = 3000;
        m2.brand = "Samsung";
        MobilePhone.name = "Phone";

        MobilePhone.staticShow(m2); // Pass object to static method and call it
    }
}
