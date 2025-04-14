package Encapsulation;

class Student{
    int id, age;
    String name;

    //Define private variables that to be keep unaccessible outside of class
    private String address;
    private long phone;

    //Define Getter and Setter method
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address; // We can either keep same variable name and use this keyword
        // this.address is comming from above assigned value "instance variable from classs"
        // address is coming from method perameter "local variable from method"
    }
    public long getPhone() {
        return phone;
    }
    public void setPhone(long ph) {
        phone = ph; // We can use different variable name in parameter
    }
    public void display(){
        System.out.println("[ " + id + " : " + name + " : " + address + " : " + phone + " ]");
    }
}

public class SimpleEncapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1;
        s1.name = "Harsh";
        s1.setAddress("Surat");
        s1.setPhone(1234);
        s1.display();

        Student s2 = new Student();
        s2.id = 2;
        s2.name = "Nidhi";
        s2.setAddress("Surat");
        s2.setPhone(5789);
        s2.display();
    }
}
