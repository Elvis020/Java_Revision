package Abstract_Classes;

abstract class Vehicle {
    private String engine;
    public String getEngine() {
        return engine;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
    abstract void drive();
}
