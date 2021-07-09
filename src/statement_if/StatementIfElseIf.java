package statement_if;

public class StatementIfElseIf {

    public static void main(String[] args) {
        var score = 65;
        var absentScore = 80;

        if (score >= 90 && absentScore >= 90) {
            System.out.println("Your score is A");
        } else if (score >= 80 && absentScore >= 80) {
            System.out.println("Your score is B");
        } else if (score >= 70 && absentScore >= 70) {
            System.out.println("Your score is B-");
        } else if (score >= 60 && absentScore >= 60) {
            System.out.println("Your score is C+");
        } else {
            System.out.println("Your score is C");
        }
    }
}