package EnumDemo;

enum Status{    // Declare Enum type class
    RUNNING, FAILED, PENDING, SUCCESS;  // Declare enum constants
}

public class EnumIfElse {
    public static void main(String[] args) {
        Status s = Status.RUNNING;

        if(s == Status.RUNNING){
            System.out.println("All Good.");
        }
        else if(s == Status.FAILED){
            System.out.println("Please try again...!");
        }
        else if(s == Status.PENDING){
            System.out.println("Please wait...!");
        }
        else if(s == Status.SUCCESS){
            System.out.println("Success!");
        }
        else{
            System.out.println("Invalid status");
        }
    }
}
