package OOPS.InheritenceDemo.CodingNinjas.ShapesAndOverRiding;

public class Main {
    public static void main(String[] args) {
        Square s = new Square("square",5);
        s.printMyType();
        System.out.println(s.calculateArea());
        Rectangle r = new Rectangle("rectangle",5,4);
        r.printMyType();
        System.out.println(r.calculateArea());

    }
}
