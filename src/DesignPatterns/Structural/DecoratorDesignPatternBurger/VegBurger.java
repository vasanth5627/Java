package DesignPatterns.Structural.DecoratorDesignPatternBurger;

public class VegBurger extends Burger{
    @Override
    String getDescription() {
        return "Veg Burger";
    }

    @Override
    double getCost() {
        return 100;
    }
}
