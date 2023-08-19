package DesignPatterns.Structural.DecoratorDesignPatternBurger;

public class Main {
    public static void main(String[] args) {
        Burger chickenBurger = new ExtraMayo(new ExtraCheese(new ChickenBurger()));
        System.out.println(chickenBurger.getCost());
    }
}
