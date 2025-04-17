package AccessModifires.Test;

public class TestProtected {
    public static void main(String[] args) {
        TestVariables tstprot = new TestVariables();
        System.out.println(tstprot.protectedVariable);
        System.out.println(tstprot.protectedString);
        tstprot.protectedShow();
    }
}
