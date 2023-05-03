package Java8.Streams;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Methods {
    public static void main(String[] args) {
        //filter -> inp is predicate

        List<String> names = List.of("Aman","Asish","Vidyut","Vasanth","Durgesh");
        List<String> newNames = names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
        System.out.println(newNames);

        //map-> inp is Function
        List<Integer> numbers = List.of(2,4,5,6,10);
        List<Integer> newNum = numbers.stream().map(e->e*e).collect(Collectors.toList());
        System.out.println(newNum);
        numbers.stream().map(e->e*e).forEach(e-> System.out.println(e));
        newNames.stream().forEach(System.out::println); //it will perform this operation on all e (function reference)

        //sort

        numbers.stream().sorted().forEach(System.out::println);
        numbers.stream().sorted((a,b)->b-a).forEach(System.out::println);
        //max and min element in a stream

        Integer integer  = numbers.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println("min: "+integer);
        Integer integer1  = numbers.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println("Max: "+integer1);


        //Redume
       Integer sum =  numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum);

        int ans = numbers.stream().mapToInt(i->i).sum();
        System.out.println(ans);

        Optional<Integer> ans1  = numbers.stream().reduce(Integer::sum);
        System.out.println(ans1);

        Optional<Integer>  max =numbers.stream().reduce((a,b)->a>b?a:b);
        System.out.println(max);

        Integer maxVal = numbers.stream().reduce(Integer::max).get();
        System.out.println(maxVal);


       String maxString = String.valueOf(names.stream().reduce((a, b)->a.length()>b.length()?a:b));
        System.out.println(maxString);
        String maxString1 = names.stream().reduce((a, b)->a.length()>b.length()?a:b)
                .get();
        System.out.println(maxString1);

        //get employee whose grade is A

       List<Employee> el =  Employee.getEmployee();
       el.forEach(e-> System.out.println(e.toString()));
        Predicate<Employee> p = e->e.Class.equalsIgnoreCase("A");
       el.stream().filter(p).forEach(e-> System.out.println(e.toString()+" Grade A"));

       //get salary of grade A employees

        el.stream().filter(p).map((e->e.salary)).forEach(e-> System.out.println(e)); //no need to
        //give toString as java internally calls toString method to print objects.
       double avgSal =  el.stream().filter(p).map((e->e.salary)).mapToDouble(i->i).average().getAsDouble();
        System.out.println(avgSal);

        double sumSal = el.stream().filter(p).map((e->e.salary)).mapToDouble(i->i).sum();
        System.out.println(sumSal);

        //plain stream
        long start =0;
        long end =0;
        start = System.currentTimeMillis();
        IntStream.range(1,10).forEach(System.out::println);
        end= System.currentTimeMillis();
        System.out.println("Plain stream took time: "+(end-start));


        //parallel stream

        start = System.currentTimeMillis();
        IntStream.range(1,10).parallel().forEach(System.out::println);
        end= System.currentTimeMillis();
        System.out.println("Parallel stream took time: "+(end-start));

        IntStream.range(1,10).forEach(x-> System.out.println("Thread: "+Thread.currentThread().getName()+" "+x));
        IntStream.range(1,10).parallel().forEach(x-> System.out.println("Thread: "+Thread.currentThread().getName()+" "+x));

//        List<Employee> employees = Employee.getEmployee();
//        System.out.println(employees);
//
//        start = System.currentTimeMillis();
//        double avgPlainsalary = employees.stream().map(e->e.salary).mapToDouble(i->i).average().getAsDouble();
//        end = System.currentTimeMillis();
//        System.out.println(avgPlainsalary);
//        System.out.println("Plain Stream: "+(end-start));
//
//        start = System.currentTimeMillis();
//        double avgParallelsalary = employees.stream().parallel().map(e->e.salary).mapToDouble(i->i).average().getAsDouble();
//        end = System.currentTimeMillis();
//        System.out.println(avgParallelsalary);
//        System.out.println("Parallel Stream: "+(end-start));

        //Find the Highest Paid Employee

        List<Employee> list = Employee.getEmployee();
        System.out.println(list);
        Employee maxSal = list.stream().reduce((a,b)->a.salary>b.salary?a:b).get();//to avoid optional we can use get
        System.out.println(maxSal);

        //group employee based on grade

       Map<String,List<Employee>> dept =  list.stream().collect(Collectors.groupingBy(e->e.Class));
        System.out.println(dept);

//        list.stream().reduce((a,b)->a.salary>b.salary?a:b).stream().forEach(e-> System.out.println(e.salary));
//        list.stream().reduce((a,b)->a.salary>b.salary?a:b).stream().collect(Collectors.groupingBy(e->e.Class));

        Map<String,Employee> dept1 =  list.stream().
                collect(Collectors.groupingBy(e->e.Class, Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparingDouble(e->e.salary)),Optional::get)));
        System.out.println(dept1);

        //create a stream
        Stream<String> st = Stream.of("Vasanth","Vijay","Ananth","Amir");
        st.forEach(e-> System.out.println(e));

        //create a stream from source

        Collection<String> cl = Arrays.asList("Hello","How","are","You");
        cl.stream().forEach(e-> System.out.println(e));

        List<String> li = Arrays.asList("Java","J2EE","Spring","Hibernate");
        li.stream().forEach(e-> System.out.println(e));

        Set<String> s = new HashSet<>(li);
        s.stream().forEach(e-> System.out.println(e));

        String[] str = {"a","b","c"};
        Arrays.stream(str).forEach(e-> System.out.println(e));

        //get products

        List<Product> prod = Product.getProducts();

        //print all the products
        prod.stream().forEach(e-> System.out.println(e));

        //get the highest and lowest price product

      //  System.out.println(prod.stream().max((a,b)-> Integer.parseInt(a.getPrice()>b.getPrice()?a.getProduct():b.getProduct())));

        System.out.println(prod.stream().reduce((a,b)->a.getPrice()>b.getPrice()?a:b).get());
        System.out.println(prod.stream().reduce((a,b)->a.getPrice()<b.getPrice()?a:b).get());

        //Q) how to have list of products (if they have same amount)

        //print products which are greater than 50000 and are type Laptop
        System.out.println("products which are greater than 40000 and are type Laptop");
        prod.stream().filter(i->i.getPrice()>40000).filter(i->i.getType().equalsIgnoreCase("Laptop")).forEach(i-> System.out.println(i));

        System.out.println("Sorting - Ascending");
        prod.stream().sorted((a,b)-> (int) (a.getPrice()-b.getPrice())).forEach(e-> System.out.println(e));

       List<Product> prodSort =  prod.stream().sorted((a,b)-> (int) (a.getPrice()-b.getPrice())).collect(Collectors.toList());
        System.out.println("Fruits sort using custom method");
       List<String> Fruits = List.of("Apple","Banana","Mango","Orange","Gauva","Blueberry","Avacado");
       Fruits.stream().sorted((a,b)->a.compareTo(b)).forEach(e-> System.out.println(e));
        System.out.println("Fruits sort using in-built method");
       Fruits.stream().sorted(Comparator.naturalOrder()).forEach(e-> System.out.println(e));

       prod.stream().sorted(Comparator.comparingDouble(Product::getPrice)).forEach(e-> System.out.println(e)); //ascending order
       prod.stream().sorted(Comparator.comparingDouble(Product::getPrice).reversed()).forEach(e-> System.out.println(e)); //descending order

//        list.stream().map(new Function<Employee, Temp>() {
//            @Override
//            public Temp apply(Employee employee) {
//                return new Temp(employee.id, employee.Name);
//            }
//        });

        list.stream().map((Employee e)->new Temp(e.id, e.Name)).forEach(e-> System.out.println(e));

        List<Integer> nums = Arrays.asList(4,7,3,2,1,10,14);
        Optional<Integer> ele = nums.stream().findFirst();
        if(ele.isPresent()){
            System.out.println(ele.get());
        }
        else{
            System.out.println("Stream is empty");
        }
        Optional<Integer> ele1 = nums.stream().findAny();
        if(ele1.isPresent()){
            System.out.println(ele1.get());
        }
        else{
            System.out.println("Stream is empty");
        }























        }

    }




