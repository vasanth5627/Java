package OOPS.SuperVsThis;

public class Person {
    public Person() {
        this(10,30);
        System.out.println("Person class default constructor");
    }
    Person(int a, int b){
        System.out.println("Person  class parameterized constructor");
    }

    void display(){
        System.out.println("Person");
    }

    final void say(){
        System.out.println("final");
    }
    void say(int a){
        System.out.println("a");
    }

}
