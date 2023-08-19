package OOPS.AbstractDemo.CN;

public class Salary extends Employee{
    public Salary(String name, int age, double salary) {
        super(name, age, salary);
    }
    void show(){

        System.out.println("We are salary abstract class");
    }

    @Override
    void here() {
        System.out.println("here");
    }
}
