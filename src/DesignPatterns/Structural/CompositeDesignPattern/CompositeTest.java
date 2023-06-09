package DesignPatterns.Structural.CompositeDesignPattern;

public class CompositeTest {
    public static void main(String[] args) {
        Component hd = new Leaf(4000, "HDD");
        Component mouse = new Leaf(1000, "Mouse");
        Component monitor = new Leaf(10000, "Monitor");
        Component cpu = new Leaf(40000, "CPU");
        Component ram = new Leaf(3000, "RAM");


        Composite ph = new Composite("Periphereal");
        Composite cabinet = new Composite("Cabinet");
        Composite mb = new Composite("MB");
        Composite computer = new Composite("Computer");

        ph.addComponent(mouse);
        ph.addComponent(monitor);
        ph.addComponent(hd);
        ph.addComponent(mb);

        computer.addComponent(ph);
        computer.addComponent(cabinet);

        ram.showPrice();
        ph.showPrice();
    }




}
