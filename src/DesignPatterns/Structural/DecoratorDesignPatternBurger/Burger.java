package DesignPatterns.Structural.DecoratorDesignPatternBurger;

public abstract class Burger {
    private String description;
    private double cost;

    abstract String getDescription();
    abstract double getCost();

}
