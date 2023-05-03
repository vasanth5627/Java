package Projects.EmailApplication;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Vasanth","Kumar","02-07-1997",12,"ComputerScience","TechDor");
        System.out.println(p);
        p.setPassword("abc12345");
        System.out.println(p);
        p.setPassword("abc12");
        System.out.println(p);


    }
}
