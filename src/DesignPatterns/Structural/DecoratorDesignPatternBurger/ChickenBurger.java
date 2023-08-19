package DesignPatterns.Structural.DecoratorDesignPatternBurger;

public class ChickenBurger extends Burger{
    @Override
    String getDescription() {
        return "Chicken Burger";
    }

    @Override
    double getCost() {
        return 180;
    }
}
