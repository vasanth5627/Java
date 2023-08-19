package OOPS.InheritenceDemo.CodingNinjas.ShapesAndOverRiding;

public class Shape {
    private String ShapeType;

    public Shape(String shapeType) {
        ShapeType = shapeType;
    }

    void printMyType(){
        System.out.println(this.ShapeType);
    }
}
