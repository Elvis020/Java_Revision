package Inner_Classes;

public class Inner_Class_Runner {
    public static void main(String[] args) {
        // Anonymous classes are like inner classes
        Machine m12 = new Machine(12);
        m12.run();
        System.out.println("_____________________");
        Machine.Tire tire = new Machine.Tire();
        tire.repair();
    }
}
