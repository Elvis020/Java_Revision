package ENUMS;

public class Enum_Runner {
    // Before Enums, we used
    static final int RED = 1;
    static final int GREEN = 2;
    static final int BLUE = 3;
    public static void main(String[] args) {
        // An ENUM is for variables to represent specific things
        // Enums represent a fixed set of values
//        int color = RED;
//        // with final
//        switch (color){
//            case RED:
//                System.out.println("RED");
//                break;
//            case BLUE:
//                System.out.println("BLUE");
//                break;
//            case GREEN:
//                System.out.println("GREEN");
//                break;
//            default:
//                break;
//        }

        // with enums
        COLOR color1 = COLOR.RED;
        switch (color1){
            case RED:
                System.out.println("RED");
                break;
            case BLUE:
                System.out.println("BLUE");
                break;
            case GREEN:
                System.out.println("GREEN");
                break;
            default:
                break;
        }

        // To get information on an enum
        System.out.println(COLOR.GREEN.getClass());
        System.out.println(COLOR.RED instanceof Enum);
        System.out.println(COLOR.GREEN.getMeaning());

        // To get the enum itself and maybe save to a DB
        System.out.println(COLOR.BLUE.name());

        COLOR c3 = COLOR.valueOf("RED");
        System.out.println(c3.getMeaning());


    }
}
