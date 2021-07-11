package method;

public class OverloadingMethod {

    public static void main(String[] args) {
        sayHello();
        sayHello("Hari Setiaji");
        sayHello("Gurindo", "Sekti");
    }

    private static void sayHello(){
        System.out.println("Hello");
    }

    private static void sayHello(String name){
        System.out.println("Hello " + name);
    }

    private static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
