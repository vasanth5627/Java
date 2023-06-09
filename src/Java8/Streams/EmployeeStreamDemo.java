package Java8.Streams;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeStreamDemo {
    static List<Emp> EmpList = new ArrayList<>();

    public static void main(String[] args) {
        EmpList.add(new Emp(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        EmpList.add(new Emp(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        EmpList.add(new Emp(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        EmpList.add(new Emp(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        EmpList.add(new Emp(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        EmpList.add(new Emp(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        EmpList.add(new Emp(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        EmpList.add(new Emp(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        EmpList.add(new Emp(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        EmpList.add(new Emp(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        EmpList.add(new Emp(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        EmpList.add(new Emp(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        EmpList.add(new Emp(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        EmpList.add(new Emp(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        EmpList.add(new Emp(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        EmpList.add(new Emp(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        EmpList.add(new Emp(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));



        //how many male and female emp are there

       long femaleCount =  EmpList.stream().filter(e->e.gender.equalsIgnoreCase("Female")).count();
        System.out.println(femaleCount);

       List<Emp> females =  EmpList.stream().filter(e->e.gender.equalsIgnoreCase("Female")).collect(Collectors.toList());
        System.out.println(females);

        long maleCount = EmpList.stream().filter(e->e.gender.equalsIgnoreCase("Male")).count();
        System.out.println(maleCount);
        List<Emp> males =  EmpList.stream().filter(e->e.gender.equalsIgnoreCase("male")).collect(Collectors.toList());
        System.out.println(males);

        //grouping both male and female

      Map<String,Long> noofEmployee=  EmpList.stream().collect(Collectors.groupingBy(e->e.gender,Collectors.counting()));
        System.out.println(noofEmployee);

        //get only names of the employee and group by gender
        Map<String, List<String>> empl = EmpList.stream().collect(Collectors.groupingBy(e->e.gender,Collectors.mapping(e->e.name,Collectors.toList())));
        System.out.println(empl);
       Hashtable<String, List<String>> hemp =  EmpList.stream().collect(Collectors.groupingBy(e->e.gender, Hashtable::new, Collectors.mapping(e->e.name,Collectors.toList())));
        System.out.println(hemp);

        //list of departments
        List<String> departments = EmpList.stream().map(e->e.department).distinct().collect(Collectors.toList());
        System.out.println("List "+EmpList.stream().collect(Collectors.groupingBy(e->e.department,Collectors.toList())));
        System.out.println(departments);

        //average age of male and female
        Map<String,Double> avgAge = EmpList.stream().collect(Collectors.groupingBy(e->e.gender, Collectors.averagingInt(e->e.age)));
        System.out.println(avgAge);

        //highest salary employee in company

        System.out.println(EmpList.stream().reduce((a,b)->a.salary>b.salary?a:b).get());

        //highest paid salary in each department

    Map<String, Optional<Emp>> highsal =  EmpList.stream().collect(Collectors.groupingBy(e->e.department,Collectors.reducing((a, b)->a.salary>b.salary?a:b)));
        System.out.println(highsal);

        //names of employees joined after 2015

        System.out.println(EmpList.stream().filter(e->e.yearOfJoining>2015).map(e->e.name).collect(Collectors.toList()));

        //count number of employees in each dept

        System.out.println(EmpList.stream().collect(Collectors.groupingBy(e->e.department,Collectors.counting())));

        //average salary of each department
        System.out.println(EmpList.stream().collect(Collectors.groupingBy(e->e.department,Collectors.averagingDouble(e->e.salary))));

        //youngest male employee in product dev

        System.out.println(EmpList.stream().filter(e->e.department.equalsIgnoreCase("Product Development")&& e.gender.equalsIgnoreCase("male")).reduce((a,b)->a.age<b.age?a:b).get());

        //employee with most work experience

        System.out.println(EmpList.stream().reduce((a,b)->a.yearOfJoining<b.yearOfJoining?a:b).get());

        //count male and female employee in sales and marketing team

        System.out.println(EmpList.stream().filter(e->e.department.equalsIgnoreCase("sales and marketing")).collect(Collectors.groupingBy(e->e.gender,Collectors.counting())));

        //names of all employee in each dept

        System.out.println(EmpList.stream().collect(Collectors.groupingBy(e->e.department,Collectors.mapping(e->e.name,Collectors.toList()))));

        //total and avg salary of a whole company

        System.out.println(EmpList.stream().collect(Collectors.summarizingDouble(e->e.salary)));

        //separate employess who is greater than 25 yr age and others
        System.out.println(EmpList.stream().collect(Collectors.partitioningBy(e->e.age>25)));

        //oldest employee in the company
        System.out.println(EmpList.stream().reduce((a,b)->a.age>b.age?a:b).get());
        System.out.println(EmpList.stream().max(Comparator.comparingInt(Emp::getAge)).get());










    }
}
