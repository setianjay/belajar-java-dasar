package loop_while;

public class WhileLoop {

    public static void main(String[] args) {
        byte[] finalScore = {
            65,
            50,
            77,
            85,
            75
        };

        var counter = 0;

        while (counter < finalScore.length){
            System.out.println(finalScore[counter]);
            counter++;
        }
    }
}
