package Projects.SchoolManagementSystem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Teacher {
    private String id;
    private String name;
    private int salary;
    private String type;

    private String year;
    public Teacher(String name, int salary, String type) {
        this.id = getNewId();
        this.name = name;
        this.salary = salary;
        this.type = type;
        this.year = getYear();
    }
    public String getNewId(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDateTime now = LocalDateTime.now();
        String date = dtf.format(now);
        int x = (int)Math.floor(Math.random()*100000)+1;
        return "T_"+date+x;

    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String getyear(){
        return year;
    }

    public int getSalary() {
        return salary;
    }

    public String getType() {
        return type;
    }
    public String getYear(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy");
        LocalDateTime now = LocalDateTime.now();
        String year = dtf.format(now);
        return  year;
    }

    public void setYear(String year){
        this.year = year;
    }
}
