package Polymorphism_MethodOverloading_MethodOverriding;

class Calculator{
    //Method to add two integer with the name add()
    public int add(int a, int b){
        return a + b;
    }

    //Method to add three integer with the name add()
    public int add(int a, int b, int c){
        return a + b + c;
    }
    
    //Method to add two double with the name add()
    public double add(double a, double b){
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int result = calc.add(10,20);
        System.out.println("Method to add two integer:: " + result);

        result = calc.add(10, 20, 30);
        System.out.println("Method to add three integer:: " + result);

        double result2 = calc.add(30, 40);
        System.out.println("Method to add two double:: " + result2);
    }
}
