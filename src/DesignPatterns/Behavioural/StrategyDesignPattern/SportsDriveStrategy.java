package DesignPatterns.Behavioural.StrategyDesignPattern;

public class SportsDriveStrategy implements Drive{
    @Override
    public void drive() {
        System.out.println("sports drive strategy");
    }
}
