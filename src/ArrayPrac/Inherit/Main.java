package ArrayPrac.Inherit;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Toyota",4,4);
        Vehicle vehicle1 = new Car("Audi",4,2,"Cher","vasanth");
        vehicle.start(); //parent
        vehicle1.start(); //child
        int x  = vehicle.getDoors(); //parent
        System.out.println(x);
        x =  vehicle1.getDoors(); //child
        System.out.println(x);


    }

}
