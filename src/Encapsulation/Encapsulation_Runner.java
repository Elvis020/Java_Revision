package Encapsulation;

class Car{
    private String type;
    static final int speed = 250;

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    private int revenueCalculator(){return 12000;}
    String getRevenue(){
        String data = "Revenue: "+ revenueCalculator();
        return data;
    }
}

public class Encapsulation_Runner {
    public static void main(String[] args) {
        // Encapsulation helps you understand the access modifiers in Java
        // Encapsulation prevents cross-linkages between classes and maintains order

    }
}
