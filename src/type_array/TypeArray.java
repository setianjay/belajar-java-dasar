package type_array;

public class TypeArray {

    public static void main(String[] args) {

        /* First way to write an array */
        final String[] classmate = new String[5];
        classmate[0] = "Danar Winanda";
        classmate[1] = "Difa Aldin";
        classmate[2] = "Divana Rifky";
        classmate[3] = "Fikri Aziz";
        classmate[4] = "Hari Setiaji";

        // edit data array
        classmate[4] = "Junda Azmi";

        for (int i = 0; i < classmate.length; i++) {
            System.out.println(classmate[i]);
        }

        // OR

        for (String s : classmate) {
            System.out.println(s);
        }


        /* Second way to write an array */
        int[] studentScores = new int[]{
          60,70,80,40,10
        };

        for (int i = 0; i < studentScores.length; i++){
            System.out.println(studentScores[i]);
        }

        // OR

        for (int studentScore : studentScores){
            System.out.println(studentScore);
        }

        /* Third way to write an array */
        Object[][] members = {
                {"Hari Setiaji",20},
                {"Gurindo Sekti",24},
                {"Khusnul Hasbi",22}
        };

        for (int i = 0; i < members.length; i++){
            for (int j = 0; j < members[i].length; j++){
                System.out.println(members[i][j]);
            }
        }

        // OR

        for (Object[] member: members){
            for (Object o: member){
                System.out.println(o);
            }
        }
    }
}
