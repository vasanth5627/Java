package OOPS.InheritenceDemo.CodingNinjas.MethodHiding;

public class Main{
    public static  void main(String[] args) {
        Parent p = new Parent();
        Parent c = new SubClass1();
        SubClass1 s = new SubClass1();
        s.show();
        p.show();
        c.show();


    }

}
