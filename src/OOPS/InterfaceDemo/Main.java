package OOPS.InterfaceDemo;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        int x = car.a;
//        car.acc();
//        car.start();
//        car.brake();
//        car.stop();
//        System.out.println(x);
//
//        Media carMedia = new Car();
//        carMedia.stop();


        NiceCar car = new NiceCar(new PowerEngine(),new CDPlayer());
        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();

    }
}
