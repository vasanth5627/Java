package OOPS.SuperVsThis;

public class Student extends Person{
    public Student() {
        this("vasanth","kumar");
        System.out.println("Student class default constructor");

    }
    public Student( String s1 , String s2){
        super();
        System.out.println("Student Class param constructor");
    }

    void print(){
        System.out.println("Print Student");
    }
    void display(){
        System.out.println("Student");
    }


}
