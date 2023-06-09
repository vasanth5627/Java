package DesignPatterns.Behavioural.StrategyDesignPattern;

public class NormalDriveStrategy implements Drive{
    @Override
    public void drive() {
        System.out.println("Normal Drive Strategy");
    }
}
