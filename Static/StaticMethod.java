package Static;

class MathHelper{
    // Define static method with parameters
    public static int add(int a, int b){
        return a + b;
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        // Call static method ".add()" directly with the class name
        int result = MathHelper.add(10, 20);

        System.out.println("Result: " + result);
    }
}