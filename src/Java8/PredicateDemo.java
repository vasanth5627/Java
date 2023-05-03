package Java8;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        String[] sarr = {"Vasanth","vasi","Kumar","Venessa","Vancouver"};
        Predicate<Integer> p = i->i%2==0;
        System.out.println(p.test(10));
        System.out.println(p.test(15));
        Employee e = new Employee("kumar",0);
        Predicate<Employee> emp = e1->e1.name == "vasanth";
        System.out.println(emp.test(e));
        Predicate<String> s = str->str.length()>5;
        for (String st:sarr) {
            System.out.print(s.test(st)+" "+st+" ");
        }
        System.out.println();

        BiPredicate<Integer,Integer> bp = (a,b)->(a+b)%2==0;
        System.out.println(bp.test(21,10));
    }
}
