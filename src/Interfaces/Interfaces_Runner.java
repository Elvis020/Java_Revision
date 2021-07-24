package Interfaces;

public class Interfaces_Runner {
    public static void main(String[] args) {
        // Interfaces cannot be instantiated
        // Interfaces are used when two or more classes share something in common
        // They can be used as types
        Computer c1 = new Computer();
        c1.start();

        Vehicle v1 = new Vehicle("Toyota");
        v1.drive();


        c1.displayInformation();
        v1.displayInformation();
        Information v2 = new Vehicle("Chevrolet");

        showInformation(c1);
        showInformation(v1);

    }

    static void showInformation(Information info){
        info.displayInformation();
    }
}
