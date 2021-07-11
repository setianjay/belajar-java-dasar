package method;

public class ParameterMethod {

    public static void main(String[] args) {
        sayHello("Hari","Setiaji");
    }

    private static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " +  lastName);
    }
}
