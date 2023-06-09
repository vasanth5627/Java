package DesignPatterns.Behavioural.StrategyDesignPattern;

public class Vehicle {
    private Drive drive;

    public Vehicle(Drive drive) {
        this.drive = drive;
    }
    public void drive(){
        drive.drive();
    }
}
