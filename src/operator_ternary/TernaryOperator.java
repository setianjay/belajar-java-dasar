package operator_ternary;

public class TernaryOperator {

    public static void main(String[] args) {
        var score = 50;
        String greeting;

        greeting = score >= 75 ? "Wow, anda lulus" : "Anda tidak lulus";

        System.out.println(greeting);
    }
}
