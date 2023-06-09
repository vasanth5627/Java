package DesignPatterns.Creational.FactoryDesignPattern;

public class pqrNetwork extends  CellularPlan{
    @Override
    void getRate() {
        rate = 1.75;
    }
}
