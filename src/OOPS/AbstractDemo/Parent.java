package OOPS.AbstractDemo;

public abstract class Parent {
    int age;
    public Parent(int age){
        this.age=age;
    }
    abstract void carrer(String name);

    abstract void partner(String name, int age);

    static void hello(){
        System.out.println("Hey");
    }
    void normal(){
        System.out.println("parent-Normal");
    }
}
