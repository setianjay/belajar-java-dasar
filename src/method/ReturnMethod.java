package method;

public class ReturnMethod {

    public static void main(String[] args) {
        System.out.println(sum(10,25));
        System.out.println(calculate(30,"-",22));
    }

    private static int sum(int value1, int value2){
        var total = value1 + value2;
        return  total;
    }

    private static int calculate(int value1, String operator, int value2){
        var total = switch (operator){
            case "+":
                yield value1 + value2;
            case "-":
                yield value1 - value2;
            default: yield 0;
        };
        return total;
    }
}
