public class Numerical_Casts {
    public static void main(String[] args) {
        byte byteVal = 3;
        short shortVal = 28;
        int intV = 7;
        long longVal = 432;

        float floatVal = 32.12f;
        double doubleVal = 12.31;

        //Type casting
        int intChange = (int) floatVal;
        System.out.println(intChange);

        intV = (int) doubleVal;
        System.out.println(intV);
    }
}
