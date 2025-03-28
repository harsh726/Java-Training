package ConditionalStatements;

public class IfElseIfElse {
    public static void main(String[] args) {
        int marks = 90;

        if (marks >= 90){
            System.out.println("Grade A with marks scored: " + marks);
        }else if(marks >= 75){
            System.out.println("Grade B with marks scored: " + marks);
        }else if(marks >= 60){
            System.out.println("Grade C with marks scored: " + marks);
        }else if(marks >= 35){
            System.out.println("Grade D with marks scored: " + marks);
        }else{
            System.out.println("Fails the exam with marks scored: " + marks);
        }
    }
}
