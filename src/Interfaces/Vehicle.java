package Interfaces;

public class Vehicle implements Information {
    String getType() {
        return type;
    }

    private String type;
    public Vehicle(String type) {
        this.type = type;
    }
    void drive(){
        System.out.println("Driving the vehicle");
    }

    @Override
    public void displayInformation() {
        System.out.println("Vehicle type is: "+ getType());
    }
}
