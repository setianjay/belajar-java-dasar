package statement_if;

public class StatementIfElse {

    public static void main(String[] args) {
        var score = 65;
        var absentScore = 80;

        if (score >= 80 && absentScore >= 75){
            System.out.println("You pass");
        }else{
            System.out.println("You didn't pass");
        }
    }
}
