package Java8;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer,Integer> f = i->i*i;
        System.out.println(f.apply(5));
        Function<String,Integer> f1= s->s.length();
        System.out.println(f1.apply("Vasanth"));

        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student("Vasanth",90));
        al.add(new Student("Kumar",30));
        al.add(new Student("Sudeep",80));
        al.add(new Student("Somu",50));

        Function<Student,String> std = s->{
            int marks = s.marks;
            if(marks>=80) return "A";
            else if(marks>=60) return "B";
            else if(marks>=50) return "C";
            else if(marks>=35) return "D";
            else return "Fail";
        };
        Predicate<Student> p = s->s.marks>60;

        for (Student s:
             al) {
            if(p.test(s))
            System.out.println(std.apply(s));

        }


        Function<Integer,Integer> f3 = i->i=2*i;
        Function<Integer,Integer> f4 = i->i*i*i;
        System.out.println(f3.andThen(f4).apply(2)); //f3 output given as inp to f4 and result is produced
        System.out.println(f3.compose(f4).apply(2)); //f4 output given as inp to f3 and result is produced
    }
}
