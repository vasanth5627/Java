package OOPS.InheritenceDemo.CodingNinjas;

public class Car {
    private int noOfGear;
    private String color;

    public Car(int noOfGear, String color) {
        this.noOfGear = noOfGear;
        this.color = color;
    }

    public int getNoOfGear() {
        return noOfGear;
    }

    public void setNoOfGear(int noOfGear) {
        this.noOfGear = noOfGear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void printCarInfo(){
        System.out.println("noOfGear: "+this.noOfGear);
        System.out.println("color: "+this.color);
    }
}
