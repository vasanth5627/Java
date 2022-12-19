package OOPS.InterfaceDemo;

public class CDPlayer implements  Media{
    @Override
    public void start() {
        System.out.println("I start songs");
    }

    @Override
    public void stop() {
        System.out.println("I stop Music");
    }
}
