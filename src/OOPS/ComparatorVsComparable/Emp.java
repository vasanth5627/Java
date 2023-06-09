package OOPS.ComparatorVsComparable;

public class Emp implements Comparable<Emp>{
    private String name;
    private String phone;
    private int emp_id;
    private double salary;

    public Emp(String name, String phone, int emp_id, double salary) {
        this.name = name;
        this.phone = phone;
        this.emp_id = emp_id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", emp_id=" + emp_id +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Emp o) {
        return (int)(this.getSalary()-o.getSalary());

    }
}
