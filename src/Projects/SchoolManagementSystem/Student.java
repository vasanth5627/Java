package Projects.SchoolManagementSystem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;

//This class is responsible to build student objects
public class Student {
    private String id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    private String year;

    

    public Student(String name, int grade, int feesPaid) {
        this.id = getNewId();
        this.name = name;
        this.grade = grade;
        this.feesPaid = feesPaid;
        this.feesTotal = getfess(grade);
        this.year = getYear();
    }

    public Student(String name) {
        this.id = getNewId();
        this.name = name;
        this.grade = -1;
        this.feesPaid =0;
        this.feesTotal=-1;
    }

    public String getNewId(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDateTime now = LocalDateTime.now();
        String date = dtf.format(now);
        int x = (int)Math.floor(Math.random()*100000)+1;
        return "S_"+date+x;

    }
    public int getfess(int grade){
        if(grade>=1 && grade<=3){
            return 50000;
        }
        else if(grade>=4 && grade<=5){
            return 70000;
        }
        else if(grade>=6 && grade<=8){
            return 90000;
        }
        else if(grade>=9 && grade<=10){
            return 100000;
        }
        else{
            return -1;
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public String getyear(){
        return year;
    }





    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setFeesPaid(int feesPaid) {
        this.feesPaid+=feesPaid;


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
    public void setFeesTotal(int feesTotal) {
        this.feesTotal = feesTotal;
    }
}
