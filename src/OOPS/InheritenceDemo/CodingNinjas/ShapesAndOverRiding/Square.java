package OOPS.InheritenceDemo.CodingNinjas.ShapesAndOverRiding;

public class Square extends Shape{
    private int length;

    public Square(String shapeType, int length) {
        super(shapeType);
        this.length = length;
    }

    int calculateArea(){
        return this.length*this.length;
    }
}
