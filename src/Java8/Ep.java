package Java8;

import OOPS.InterfaceDemo.ExtendsDemo.A;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Ep {
    String name;
    int salary;
    Ep(String name,int salary){
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {
        ArrayList<Ep> al = new ArrayList<>();
        al.add(new Ep("vasanth",20000));
        al.add(new Ep("Kumar",5000));
        al.add(new Ep("Vidha",15000));
        al.add(new Ep("Vaish",30000));
        al.add(new Ep("Vinay",3000));

        Predicate<Ep> p = e->e.salary>10000;
        Predicate<Ep> ped = e->e.salary<20000;
        System.out.println("p");
        for (Ep p1:al) {
            if(p.test(p1)){
                System.out.println(p1.name+" "+p1.salary);
            }
        }
        System.out.println("and");
        for (Ep p1:al) {
            if(p.and(ped).test(p1)){
                System.out.println(p1.name+" "+p1.salary);
            }
        }

        System.out.println("Or");
        for (Ep p1:al) {
            if(p.or(ped).test(p1)){
                System.out.println(p1.name+" "+p1.salary);
            }
        }
        System.out.println("Negate");
        for (Ep p1:al) {
            if(p.negate().test(p1)){
                System.out.println(p1.name+" "+p1.salary);
            }
        }
    }
}
