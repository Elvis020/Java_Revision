package Abstract_Classes;

public class Abstract_Runner {
    public static void main(String[] args) {
        Car c1= new Car();
        Truck t1 = new Truck();

        t1.setEngine("non-hybrid");
        c1.setEngine("hybrid");

        t1.drive();
        c1.drive();
    }
}
