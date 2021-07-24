package Inner_Classes;

public class Machine {
    private int id;
    public Machine(int id) {
        this.id = id;
    }
    final String type = "Electric";
    void run(){
        System.out.println("Run machine.. "+id);
        AI ai = new AI();
        ai.activate();

        //Creating an inner class
        class Test{
            void example1(){
                System.out.println("ID is: "+id);
                System.out.println("Type is: "+type);
            }
        }
        Test t1 = new Test();
        t1.example1();
    }

    // Creating a non-static class(inner-class/nested class)
    // Inner classes are used to group different parts of a class
    class AI{
        void activate(){
            System.out.println("Machine "+id+" is activated");
        }
    }

    // static inner classes
    // static inner class can only access static variables
    // static classes are used if you want a class not related to the instance of particular class
    static class Tire{
        void repair(){
            System.out.println("Tires are repaired");
        }
    }


}
