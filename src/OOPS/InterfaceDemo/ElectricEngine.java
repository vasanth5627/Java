package OOPS.InterfaceDemo;

public class ElectricEngine implements  Engine{
    @Override
    public void start() {
        System.out.println("Electric enigne start");
    }

    @Override
    public void stop() {
        System.out.println("electric Engine stops");
    }

    @Override
    public void acc() {
        System.out.println("Electric Engine accelerate");
    }
}
