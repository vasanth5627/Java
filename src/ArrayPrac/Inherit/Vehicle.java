package ArrayPrac.Inherit;

public class Vehicle {
    private String engine;
    private int wheels;
    private int doors;

    public Vehicle(String engine, int wheels, int doors) {
        this.engine = engine;
        this.wheels = wheels;
        this.doors = doors;
    }

    public Vehicle() {
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void start(){
        System.out.println("vehicle has started");
    }
}
