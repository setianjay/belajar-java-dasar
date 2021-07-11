package loop_for;

public class ForLoop {

    public static void main(String[] args) {

        System.out.println("Looping numbers");
        for (int i = 1; i <= 10; i++){
            System.out.println("Loop" + i);
        }
        System.out.println("");

        /* For loop in array */
        String[] products = {
                "Electronic",
                "Fashion",
                "Health"
        };

        System.out.println("Looping arrays");
        for (var i = 0; i < products.length; i++){
            System.out.println(products[i]);
        }

        for (String product : products){
            System.out.println(product);
        }

    }
}
