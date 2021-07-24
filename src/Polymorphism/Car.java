package Polymorphism;

public class Car extends Vehicle{

    @Override
    void design() {
        System.out.println("Car design");
    }
    void ride(){
        System.out.println("I am riding a car!!!");
    }
}
