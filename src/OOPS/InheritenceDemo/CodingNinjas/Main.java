package OOPS.InheritenceDemo.CodingNinjas;

public class Main {
    public static void main(String[] args) {
        Car c = new Car(4,"red");
        Car c1 = new RaceCar(4,"green",100);
        RaceCar c2 = new RaceCar(4,"yellow",120);
        c.printCarInfo();
        c1.printCarInfo();
        c2.printCarInfo();
    }
}
