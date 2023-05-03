package Java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        //get stream object

        //blank stream
        Stream<Object> es = Stream.empty();
        es.forEach(e->{
            System.out.println(e);
        });
        //array to stream
        String[] names = {"Vasanth","Suresh","Uttam","Ankesj"};
//       List<String> x = Arrays.stream(names).filter(e->e.startsWith("A")).collect(Collectors.toList());
//        System.out.println(x);
        Stream<String> st  = Stream.of(names);
        st.forEach(e-> System.out.println(e));

        //arrays to stream

        IntStream str = Arrays.stream(new int[]{2,3,45,5,6});
        str.forEach(e-> System.out.println(e));

        //builder pattern

       Stream<Object> sb= Stream.builder().build();

       //List, set


    }
}
