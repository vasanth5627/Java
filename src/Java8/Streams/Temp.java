package Java8.Streams;

public class Temp {
    private int id;
    private String name;

    public Temp(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.id+" "+this.name;
    }
}
