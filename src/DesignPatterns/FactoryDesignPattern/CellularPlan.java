package DesignPatterns.FactoryDesignPattern;

abstract class CellularPlan {
    double rate;
    abstract void getRate();
    public void processBill(int minutes){
        System.out.println(minutes*rate);
    }
}
