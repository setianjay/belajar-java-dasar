package loop_dowhile;

public class DoWhileLoop {

    public static void main(String[] args) {
        var counter = 11;

        System.out.println("Do while fail");
        do{
            System.out.println(counter);
            counter++;
        }while (counter <= 10);

        var counter1 = 1;

        System.out.println("Do while success");
        do{
            System.out.println(counter1);
            counter1++;
        }while (counter1 <= 10);
    }
}
