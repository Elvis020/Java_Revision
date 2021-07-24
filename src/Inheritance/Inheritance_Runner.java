package Inheritance;

public class Inheritance_Runner {
    // With inheritance, you can extend any class except final classes
    // access modifiers include: public, private, default(this means lack of access modifier) and protected
    public static void main(String[] args) {
        MyFactory f1 = new MyFactory();
        f1.design();
        f1.build();

        Car c1 = new Car();
        c1.design();
        c1.build();
        c1.brand();
    }
}
