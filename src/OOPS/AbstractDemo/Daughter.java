package OOPS.AbstractDemo;

public class Daughter extends Parent{
    public Daughter(){
        super(34);
    }
    @Override
    void carrer(String name) {
        System.out.println("d-Iam going to be a "+name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("d-I love "+name+" he is "+age);
    }
}
