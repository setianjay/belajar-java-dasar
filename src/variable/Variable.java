package variable;

public class Variable {

    public static void main(String[] args) {
        final String name;
        name = "Hari Setiaji";

        System.out.println(name);

        /* Error because variable name is final (immutable).
        name = "Gurindo Sekti";
        */

        int age = 30;
        String address = "Kp. pos citayam";
        System.out.println(age);
        System.out.println(address);

        /**
         * In jdk 10 initialization variable can use 'var' for identification. But if initialization using 'var'
         * you must sign the value (mandatory) to variable directly.
         * You don't have to insert data types into variables, because java is smart to identify the data type.
         * */

        /* Example making variable with 'var' */

        var university = "Polytechnic LP3I Jakarta Campus Depok";
        System.out.println(university);

        /* Error because in var declaration we must sing the value to variable directly.
        var semester;
        semester = 10;
        */
    }
}
