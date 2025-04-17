package AccessModifires.Test;

public class TestVariables {
    public int publicVariable = 10;
    public String publicString = "This is public string variable from AccessModifires.Test package TestVariables class";
    public void publicShow(){
        System.out.println("This is public method from AccessModifires.Test package TestVariables class");
    }

    private int privateVariable = 20;
    private String privateString = "This is provate string variable from AccessModifires.Test package TestVariables class";

    protected int protectedVariable = 10;
    protected String protectedString = "This is protected string variable from AccessModifires.Test package TestVariables class";
    protected void protectedShow(){
        System.out.println("This is protected method from AccessModifires.Test package TestVariables class");
    }

    int defaultVariable  = 60;
}
