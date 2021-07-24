package Polymorphism;

public class Polymorphism_Runner {
    public static void main(String[] args) {
        // Polymorphism basically means if you have a sub-class and a super-class,
        // you would normally use the subclass in place of the super class
        // v2.design() yields that of car because, the vehicle reference points to a
        // car object. In polymorphism, its not the object that its important its
        // what the object is pointing to.
        // The Type of the variable determines which method you can call and this is
        // illustrated from the ride example

        Vehicle v = new Vehicle();
        Car c = new Car();
        Vehicle v2 = c; //polymorphism in action
        v2.design();
        //v2.ride() //This won't run because Vehicle type doesn't have a ride method
        createDesign(c); // This is possible because of polymorphism
    }

    // Example 2 of polymorphism
    static void createDesign(Vehicle v){
        v.design();
    }
}
