package DesignPatterns.Structural.DecoratorDesignPattern;

public class Mushrooms extends ToppingDecorator{
    BasePizza pizza;

    public Mushrooms(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost()+15;
    }
}
