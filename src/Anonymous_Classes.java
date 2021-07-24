
class Computer{
    void shutDown(){
        System.out.println("Computer is shutting down!!");
    }
}

interface Phone{
    void call();
}

public class Anonymous_Classes {
    public static void main(String[] args) {
        Computer c1 = new Computer();
        c1.shutDown();

        // Anonymous class (another way of overriding methods apart
        // from extending classes is to use the anonymous class
        // method)
        Computer c2 = new Computer(){
            @Override
            void shutDown() {
                System.out.println("Macbook is shutting down");
            }
        };
        c2.shutDown();

        // Anonymous example 2 - using interfaces
        // This creates an anonymous class that implements the interface
        Phone p = new Phone(){
            @Override
            public void call() {
                System.out.println("Calling from phone!");
            }
        };
        p.call();
    }
}
