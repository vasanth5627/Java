package OOPS.AbstractDemo.CN;

public class Name extends Employee {
    public Name(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    void here() {
        System.out.println("we are in name");
    }
}
