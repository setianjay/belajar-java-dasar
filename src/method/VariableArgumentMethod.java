package method;

public class VariableArgumentMethod {

    public static void main(String[] args) {
        int[] numbers = {
                10,20,30,40,50
        };

        System.out.println(sum(10,20,30,40,50));

        // OR
        System.out.println(sum(numbers));
    }

    private static int sum(int... numbers){
        var total = 0;
        for (var number : numbers){
            total += number;
        }
        return total;
    }
}
