package DesignPatterns.Structural.DecoratorDesignPattern;

public class Main{
    public static void main(String[] args) {
        BasePizza pizza = new Mushrooms(new ExtraCheese(new Margherita()));
        System.out.println(pizza.cost());

    }
}
