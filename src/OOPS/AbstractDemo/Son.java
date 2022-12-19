package OOPS.AbstractDemo;

public class Son extends  Parent{
    public Son(int age){
        super(24);
    }
    @Override
    void carrer(String name) {
        System.out.println("s-Iam going to be a "+name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("s-I love "+name+" she is "+age);
    }
    void normal(){
        super.normal();
        System.out.println("son");
    }
}
