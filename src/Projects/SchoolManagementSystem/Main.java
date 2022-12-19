package Projects.SchoolManagementSystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Teacher>  teachers = new ArrayList<>();
        Teacher Linda = new Teacher("Linda",70000,"Primary");
        Teacher Ramesh = new Teacher("Ramesh",90000,"Secondary");
        Teacher Daisy = new Teacher("Daisy",75000,"Primary");
        Teacher Suresh = new Teacher("Suresh",150000,"Senior Secondary");
        ArrayList<Student> students = new ArrayList<>();
        Student Vasanth = new Student("Vasanth",10,0);
        Student Prasanth = new Student("Prasanth",9,0);
        Student Jaswanth = new Student("Jaswanth",7,0);
        Student Hemanth = new Student("Hemanth",10,0);
        Student Harish = new Student("Harish",5,0);
        Student Rajesh = new Student("Rajesh",1,0);
        Student Sai = new Student("Sai",8,0);
        Student Mahesh  = new Student("Mahesh",2,0);

        School KV = new School("KV",teachers,students);
        KV.addStudent(Vasanth);
        KV.addStudent(Prasanth);
        KV.addStudent(Jaswanth);
        KV.addStudent(Hemanth);
        KV.addStudent(Harish);
        KV.addStudent(Rajesh);
        KV.addStudent(Sai);
        KV.addStudent(Mahesh);
        KV.addTeacher(Linda);
        KV.addTeacher(Ramesh);
        KV.addTeacher(Daisy);
        KV.addTeacher(Suresh);


        System.out.println(KV.getTotalMoneyEarned());
        System.out.println(KV.getTotalMoneySpent());



    }
}
