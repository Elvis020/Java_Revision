package Interfaces;

public class Computer implements Information{
    private int serialNum = 892;
    void start(){
        System.out.println("Computer Started");
    }

    @Override
    public void displayInformation() {
        System.out.println("Information from computer with serial number: " + serialNum);
    }
}
