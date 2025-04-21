package WrapperClass;

public class WrapperDemo {
    public static void main(String[] args) {
        int num = 20;
        Integer num2 = num; // auto-Boxing
        Integer num3 = new Integer(num); // Boxing or Manual boxing
        System.out.println(num2 + " : " + num3);

        Double temp = 40.00;
        double a = temp; // auto-Unboxing
        double b = temp.doubleValue();  //Unboxing or Manual unboxing
        System.out.println(a + " : " + b);
    }
}
