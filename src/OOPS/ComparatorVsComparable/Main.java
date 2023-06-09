package OOPS.ComparatorVsComparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Emp> emps = new ArrayList<>();
        emps.add(new Emp("Vasanth","998123481908",1,10000.0));
        emps.add(new Emp("Kumar","998123481907",2,9000.0));
        emps.add(new Emp("Bhavesh","898123481908",3,15000.0));
        emps.add(new Emp("Bhuvan","798123481918",4,12000.0));
        emps.add(new Emp("Yuvi","698123491900",5,3000.0));

        System.out.println(emps);

//        Collections.sort(emps, (a,b)-> (int) (b.getSalary()-a.getSalary()));
//        System.out.println(emps);

        //comparable

        //the objects you want to compare, the corresponding class has to implement Comparable interface
            Collections.sort(emps,new SalaryComparator());
            System.out.println(emps);

            ArrayList<Emp> emps1 = new ArrayList<>(emps);
            Collections.sort(emps1,new NameComparator());
             System.out.println(emps1);


    }
}
