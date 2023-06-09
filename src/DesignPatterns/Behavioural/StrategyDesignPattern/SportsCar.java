package DesignPatterns.Behavioural.StrategyDesignPattern;

public class SportsCar extends Vehicle {

    public SportsCar() {
        super(new SportsDriveStrategy());
    }
}
