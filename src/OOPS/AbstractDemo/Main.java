package OOPS.AbstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(24);
        son.carrer("engineer");
        son.partner("any", son.age);

        Daughter daughter = new Daughter();
        daughter.carrer("doctor");
        daughter.partner("any", daughter.age);


         //  Parent p = new Parent(); we cannot create objects for abstract classes, constructors because
        // we donot have the implementation of functions.
        // we cannot create abstract static methods and we cannot override static methods
        // we cannot have a final abstract class
        // we can create static methods in abstract classes.

        Parent.hello();
        son.normal();

    }
}
