package ConditionalStatements;

public class NestedIf {
    public static void main(String[] args) {
        int age = 25;
        boolean hasID = true;

        if (age >= 18){
            if(hasID){
                System.out.println("You are eligible to drink beer.");
            }
            else{
                System.out.println("ID required.");
            }
        } else {
            System.out.println("You are not eligible to drink beer at the age " + age);
        }
    }
}
