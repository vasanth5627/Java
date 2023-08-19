package DesignPatterns.Structural.DecoratorDesignPatternBurger;

public class ExtraMayo extends BurgerDecoration{
    private Burger burger;

    public ExtraMayo(Burger burger) {
        this.burger = burger;
    }

    @Override
    String getDescription() {
        return this.burger.getDescription()+" with Extra Mayo";
    }

    @Override
    double getCost() {
        return this.burger.getCost()+20;
    }
}
