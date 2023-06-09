package ArrayPrac.Inherit;

public class Car extends  Vehicle{
    private String name;
    private String owner;

    public Car(String engine, int wheels, int doors, String name, String owner) {
        super(engine, wheels, doors);
        this.name = name;
        this.owner = owner;
    }

    public Car(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void start(){
        System.out.println("car has started");
    }

}
