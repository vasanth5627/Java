package DesignPatterns.Behavioural.StrategyDesignPattern;

public class NormalCar  extends Vehicle{

    public NormalCar() {
      super(new NormalDriveStrategy());
    }
}
