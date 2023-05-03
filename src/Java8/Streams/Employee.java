package Java8.Streams;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    String Name;
    int id;
    double salary;
    String Class;

    public Employee(String name, int id, double salary, String Class) {
        Name = name;
        this.id = id;
        this.salary = salary;
        this.Class = Class;
    }

    static List<Employee> getEmployee(){
        List<Employee> el = new ArrayList<>();
        el.add(new Employee("vasanth",1,10000,"A"));
        el.add(new Employee("Vijay",2,50000,"B"));
        el.add(new Employee("Vimal",3,90000,"A"));
        el.add(new Employee("Asharv",4,80000,"C"));
        el.add(new Employee("Kumar",5,1000,"A"));
        el.add(new Employee("Varsh",6,8000,"B"));
        el.add(new Employee("Darsh",7,56000,"C"));

//        for (int i = 1; i < 1000; i++) {
//            el.add(new Employee("a"+i,i,new Random().nextDouble()*1000 ,"A"));
//        }
        return el;
    }




    public String toString(){
        return this.Name+" "+this.id+" "+this.salary+" "+this.Class;
    }

    public static void main(String[] args) {
        List<Employee> el = Employee.getEmployee();
        for (Employee e : el) {
            System.out.println(e);
        }
        for (int i = 0; i < el.size(); i++) {
            System.out.println(el.get(i));
        }
        double x = Math.random();


    }


    }


