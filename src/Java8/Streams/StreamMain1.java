package Java8.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
    public static void main(String[] args) {
        //create a list and filter all even number from List
        List<Integer> l = List.of(2,3,4,5,50,21,22,67); //immutable list (cannot add or delete elements)
        List<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(34);
        al.add(23);
        al.add(78);
        al.add(12);
        Integer[] arr = {10,30,23,44,12};
        List<Integer> l1 = Arrays.asList(2,3,4,5); //cannot modify the list
        List<Integer> l2 = Arrays.asList(arr);
        List<Integer> even = new ArrayList<>();
        for(Integer i : l){
            if(i%2==0) even.add(i);
        }
        System.out.println(even);
        even.clear();
        l.forEach((e)->{
            if(e%2==0) even.add(e);
        });
        System.out.println(even);

        //using streams

//        Stream<Integer> stream = l.stream(); //we got stream from l
//        Predicate<Integer> p = (e)->e%2==0;
//        List<Integer> newList = stream.filter(p).collect(Collectors.toList());
//        System.out.println(newList);

        List<Integer> newList = l.stream().filter(i->i%2==0).collect(Collectors.toList()); //method chaining
        System.out.println(newList);
        newList.clear();;
        newList = l.stream().filter(i->i>10).collect(Collectors.toList());
        System.out.println(newList);




    }
}
