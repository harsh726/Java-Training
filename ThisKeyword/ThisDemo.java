package ThisKeyword;

class Student{
    private int id;
    private String name;
    private String address;

    //Define getter-setter method
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }  
}

public class ThisDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setId(1);
        s1.setName("Harsh");
        s1.setAddress("Surat");
        System.out.println("[" + s1.getId() + " : " + s1.getName() + " : " + s1.getAddress() + "]");
    }
}
