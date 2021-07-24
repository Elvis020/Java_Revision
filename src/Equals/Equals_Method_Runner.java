package Equals;

import java.util.Objects;

class Laptop{
    private int id;
    private String brand;

    public Laptop(int id, String brand) {
        this.id = id;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                '}';
    }
}


public class Equals_Method_Runner {
    public static void main(String[] args) {
        Laptop l1 = new Laptop(250,"HP");
        Laptop l2 = new Laptop(90,"Dell");
        System.out.println(l1.equals(l2));// logical equality
        System.out.println(l1 == l2); //Checks if l1 and l2 are pointing
        // to the same object(reference equality)


        // But with primitive types, you can just compare them with ==
        // To edit the basis of .equals method you will have to edit the
        // hashcode




    }
}
