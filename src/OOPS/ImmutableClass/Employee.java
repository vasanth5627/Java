package OOPS.ImmutableClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public final class Employee implements  Cloneable{
    private final String name;
    private final int id;
    private final List<String> phones;

    private final Date doj;

    public Employee(String name, int id, List<String> phones, Date doj) {
        this.name = name;
        this.id = id;
        this.phones = phones;
        this.doj = doj;
    }

    public String getName() {
        return name;
    }

    public Date getDoj() {
        return (Date) doj.clone();
    }

    public int getId() {
        return id;
    }

    public List<String> getPhones() {
        return new ArrayList<>(phones);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", phones=" + phones +
                ", doj=" + doj +
                '}';
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e = new Employee("vasanth",1, Arrays.asList("123","234"),new Date());
        System.out.println(e);
       e.getPhones().add("345");
        System.out.println(e);
        e.clone(); //clone not supported if we don't implement cloneable interface
        System.out.println(e);
    }
}
