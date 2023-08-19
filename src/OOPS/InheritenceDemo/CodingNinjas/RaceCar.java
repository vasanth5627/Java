package OOPS.InheritenceDemo.CodingNinjas;

public class RaceCar extends Car {
    int maxSpeed;
    public RaceCar(int noOfGear, String color,int maxSpeed){
        super(noOfGear,color);
        this.maxSpeed = maxSpeed;
    }
    void printCarInfo(){
        System.out.println("noOfGear: "+this.getNoOfGear());
        System.out.println("color: "+this.getColor());
        System.out.println("maxSpeed: "+this.maxSpeed);
    }
}
