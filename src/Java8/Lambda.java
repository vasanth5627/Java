package Java8;

import OOPS.InterfaceDemo.NestedInterface.A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class myComp implements  Comparator<Integer> {

    @Override
//    public int compare(Integer o1, Integer o2) {
//        if (o1 > o2) return 1;
//        if (o1 < o2) return -1;
//        return 0;
//    }
    public int compare(Integer o1, Integer o2) {
//        if (o1 > o2) return 1;
//        if (o1 < o2) return -1;
        return o2-o1;
    }
}
public class Lambda {


    public static void main(String[] args) {
//        Function<Integer,Integer> f = i->i*i;
//        Predicate<Integer> p = i->i%2==0;
//
//        System.out.println(f.apply(4));
//        System.out.println(p.test(4));
//        Runnable hi = () ->{ System.out.println("hi"); };
//        (int a,int b)-> {
//            System.out.println(a+b);
//        };
//        (int n)-> {return n*n;};
//        (int n)->n*n;
//        n->n*n;

//        Interf i = ()-> System.out.println("hi");
//        i.m1();
//        add ad = (a,b)->System.out.println(a+b);
//        ad.add(2,3);
//        Square s = n->n*n;
//        System.out.println(s.square(4));
//
//        Runnable r = ()->{
//            for (int j = 0; j < 10; j++) {
//                System.out.println("Child Thread");
//            }
//        };
//        Thread th = new Thread(r);
//        th.start();
//        for (int j = 0; j < 10; j++) {
//            System.out.println("Main Thread");
//        }


        ArrayList<Integer> al = new ArrayList<>();
        al.add(20);
        al.add(10);
        al.add(15);
        al.add(30);
        al.add(3);
        myComp c = new myComp();
//        Collections.sort(al,c);
//        System.out.println(al);
        Collections.sort(al,(a,b)->{return b-a;});
 //       al.stream().forEach(System.out::println); // stream and method reference
       // System.out.println(al);
//        List<Integer> al2 = al.stream().filter(j->j%2==0).collect(Collectors.toList());
//        System.out.println("Even Numbers");
//        al2.stream().forEach(System.out::println);

//        Runnable r = new Runnable() {
//            @Override
//            public void run() { //anonymous inner class
//                for (int i=0;i<10;i++)
//                System.out.println("Child Thread");
//            }
//        };
        Intef1 in = new Intef1() {
            @Override
            public void m1() {
                System.out.println("m1");
            }

            @Override
            public void m2() {
                System.out.println("m2");
            }
        };



        in.m1();
        in.m2();


    }
}
