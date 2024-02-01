package Java8.Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        //get stream object

        //blank stream
        Stream<Object> es = Stream.empty();
        es.forEach(e->{
      //      System.out.println(e);
        });
        //array to stream
        String[] names = {"Vasanth","Suresh","Uttam","Ankesj"};
//       List<String> x = Arrays.stream(names).filter(e->e.startsWith("A")).collect(Collectors.toList());
//        System.out.println(x);
        Stream<String> st  = Stream.of(names);
        //st.forEach(e-> System.out.println(e));

        //arrays to stream

        IntStream str = Arrays.stream(new int[]{2,3,45,5,6});
      //  str.forEach(e-> System.out.println(e));

        //builder pattern

       Stream<Object> sb= Stream.builder().build();

       //List, set




        List<Integer> numbers = Arrays.asList(10,20,30,40,13,19,5);
        //sum should already be 10
        //sum of numbers in a List
        int sum = numbers.stream().reduce(10,(e, e1) -> e+e1);
        System.out.println(sum);

        //average

        double avg = numbers.stream().mapToInt(e->e).average().getAsDouble();
        System.out.println(avg);

        int avg1 = (int)numbers.stream().map(e->e*e).filter(e->e%2==0)
                .mapToInt(e->2*e)
                .average().getAsDouble();

        System.out.println(avg1);

        //print even and odd

        numbers.stream().filter(e->e%2==0).forEach(e-> System.out.print(e+" "));
        numbers.stream().filter(e->e%2==1).forEach(e-> System.out.print(e+" "));

        List<Integer> prefix2 = Arrays.asList(22,20,312,123,222,292,0);

        System.out.println(prefix2.stream().map((e)->{
            int re=0;
            while (e>0){
                re = e%10;
                e=e/10;
            }
            if(re==2) return re;
            return 0;
        }).collect(Collectors.toList()));

        //find duplicates

        List<Integer> duplicates = Arrays.asList(1,1,2,3,4,1,2,4,5);
        duplicates.stream().filter(e->Collections.frequency(duplicates,e)>1)
                .collect(Collectors.toSet())
                .forEach(e-> System.out.print(e+" "));
    }
}
