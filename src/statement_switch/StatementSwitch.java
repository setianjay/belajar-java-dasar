package statement_switch;

public class StatementSwitch {

    public static void main(String[] args) {
        var score = "B";

        switch (score){
            case "A":
                System.out.println("Wow, anda lulus");
                break;
            case "B":
            case "C":
                System.out.println("Anda lulus");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Anda belum ujian");
        }

        /**
         * in java 15, you can write switch statement with lambda expression.
         * in java 14, you can write switch statement with return value by 'yield'.
         * */

        /* switch with lambda */
        var finalScore = 90;
        switch (finalScore){
            case 90 -> System.out.println("Wow, anda lulus");
            case 80, 70 -> System.out.println("Anda lulus");
            default -> System.out.println("Anda tidak lulus");
        }

        /* switch with return value */

        // first way
        String greeting1;
        switch (score){
            case "A" -> greeting1 = "Wow, anda lulus";
            case "B","C" -> greeting1 = "Anda lulus";
            case "D" -> greeting1 = "Anda tidak lulus";
            default -> greeting1 = "Anda belum ujian";
        }

        System.out.println("Greeting : " + greeting1);

        // second way
        String greeting2 = switch (score){
            case "A":
                yield "Wow, anda lulus";
            case "B":
            case "C":
                yield "Anda lulus";
            case "D":
                yield "Anda tidak lulus";
            default: yield "Anda belum ujian";
        };

        System.out.println("Greeting: " + greeting2);
    }
}
