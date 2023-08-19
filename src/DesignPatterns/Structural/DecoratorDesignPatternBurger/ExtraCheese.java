package DesignPatterns.Structural.DecoratorDesignPatternBurger;

public class ExtraCheese extends BurgerDecoration {
    private Burger burger;

    public ExtraCheese(Burger burger) {
        this.burger = burger;
    }

    @Override
    String getDescription() {
        return this.burger.getDescription()+" with Extra Cheese";
    }

    @Override
    double getCost() {
        return this.burger.getCost()+10;
    }
}
