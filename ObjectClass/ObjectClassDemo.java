package ObjectClass;

class Laptop{
    String model;
    int price;
    
    @Override
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
}

public class ObjectClassDemo {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.model = "ASUS ROG Strix";
        l1.price = 2000;
        System.out.println(l1.toString());
        System.out.println(l1.hashCode());
        System.out.println(l1.equals(l1));
    }    
}
