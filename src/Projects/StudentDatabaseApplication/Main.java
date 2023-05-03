package Projects.StudentDatabaseApplication;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Student s = new Student("vasanth","A",1900);
        System.out.println(s);
        s.enrollCourses();
    }
}
