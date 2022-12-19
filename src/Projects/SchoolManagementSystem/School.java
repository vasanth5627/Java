package Projects.SchoolManagementSystem;

import java.util.ArrayList;

public class School {
    private  String name;
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;



    public School(String name,ArrayList<Teacher> teachers, ArrayList<Student> students) {
        this.name  = name;
        this.teachers = teachers;
        this.students = students;
        this.totalMoneyEarned = 0;
        this.totalMoneySpent=0;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public  String getName(){
        return  this.name;
    }


    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
        updateTotalMoneySpent(teacher.getSalary());
    }

    public void addStudent(Student student) {
        this.students.add(student);
        updateTotalMoneyEarned(student.getFeesTotal());
    }

    private void updateTotalMoneyEarned(int totalMoneyEarned) {
        this.totalMoneyEarned+=totalMoneyEarned;
    }

    private void updateTotalMoneySpent(int totalMoneySpent) {
        this.totalMoneySpent+=totalMoneySpent;
    }

    public int grossIncome(){
       return  this.totalMoneyEarned-this.totalMoneySpent;
    }
}
