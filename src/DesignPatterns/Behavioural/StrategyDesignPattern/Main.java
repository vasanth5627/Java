package DesignPatterns.Behavioural.StrategyDesignPattern;

public class Main {
    public static void main(String[] args) {
        NormalCar nc = new NormalCar();
        nc.drive();
        SportsCar sc = new SportsCar();
        sc.drive();
    }
}
