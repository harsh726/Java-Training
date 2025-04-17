package AccessModifires1;

import AccessModifires.Test.TestVariables;

public class TestPublic {
    public static void main(String[] args) {
        TestVariables tp = new TestVariables();
        System.out.println("Public int variable \"publicVariable\": " + tp.publicVariable);
        System.out.println("Public String variable \"publicString\": " + tp.publicString);
        tp.publicShow();
    }
}
