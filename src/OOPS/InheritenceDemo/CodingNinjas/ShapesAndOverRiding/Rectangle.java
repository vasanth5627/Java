package OOPS.InheritenceDemo.CodingNinjas.ShapesAndOverRiding;

public class Rectangle extends Shape{
   private int length;
   private int breadth;

    public Rectangle(String shapeType, int length, int breadth) {
        super(shapeType);
        this.length = length;
        this.breadth = breadth;
    }

    int calculateArea(){
        return this.length*this.breadth;
    }
}
