package number;


public class TypeNumber {

    public static void main(String[] args) {
        /* Fixed numbers */
        byte initByte = 126;
        short initShort = 32_000;
        int initInt = 2_000_000_000;
        long initLong = 3_000_000_000L;

        System.out.println("-----Fixed Numbers-----");
        System.out.println("byte : "+ initByte);
        System.out.println("short : "+ initShort);
        System.out.println("int : "+ initInt);
        System.out.println("long : "+ initLong);

        /* Floating point numbers */
        float initFloat = 10.12F;
        double initDouble = 10.12;

        System.out.println("-----Floating Point Numbers-----");
        System.out.println("float: " + initFloat);
        System.out.println("double: " + initDouble);

        /* Literal numbers */
        int initDecimal = 30;
        int initHex = 0xFFEBAC;
        int initBin = 0b0001;

        System.out.println("-----Literal Numbers-----");
        System.out.println("decimal: " + initDecimal);
        System.out.println("hexadecimal: " + initHex);
        System.out.println("binary: " + initBin);
    }
}
