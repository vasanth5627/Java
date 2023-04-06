package Java8;

import OOPS.InterfaceDemo.ExtendsDemo.A;

import java.util.ArrayList;
import java.util.Collections;

public class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return this.name+" : "+this.id;
    }

    public static void main(String[] args) {
        Employee e = new Employee("Hydra",0);
        System.out.println(e);
        ArrayList<Employee> al = new ArrayList<>();
        al.add(new Employee("vasanth",1));
        al.add(new Employee("Suresh",4));
        al.add(new Employee("vinay",3));
        al.add(new Employee("Kumar",2));
        al.add(new Employee("Noob",5));
        System.out.println("default array");
        System.out.println(al);
        Collections.sort(al, (a,b)->a.id-b.id);
        System.out.println("Ascending Order");
        System.out.println(al);
        Collections.sort(al, (a,b)->b.id-a.id);
        System.out.println("Descending Order");
        System.out.println(al);
        Collections.sort(al,(a,b)->a.name.compareTo(b.name));
        System.out.println("Ascending Order name");
        System.out.println(al);
        Collections.sort(al,(a,b)->b.name.compareTo(a.name));
        System.out.println("Descending order name");
        System.out.println(al);
    }
}
