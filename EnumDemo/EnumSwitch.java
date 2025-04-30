package EnumDemo;

enum Status{    // Declare Enum type class
    RUNNING, FAILED, PENDING, SUCCESS;  // Declare enum constants
}

public class EnumSwitch {
    public static void main(String[] args) {
        Status s = Status.SUCCESS;

        switch (s) {
            case RUNNING:
                System.out.println("All Good.");
                break;
            case FAILED:
                System.out.println("Please try again...!");
                break;
            case PENDING:
                System.out.println("Please wait...!");
                break;
            case SUCCESS:
                System.out.println("Success!");
                break;
            default:
                System.out.println("Invalid response");
                break;
        }
    }
}
