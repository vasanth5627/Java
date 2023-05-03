package OOPS.Serilization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial {
    public static void main(String[] args) throws IOException {
        //create object of student
        //System.out.println(System.getProperty("user.dir"));
        Student s = new Student("Vasanth","abc@gmail.com",25,"A.P");

        //write data to file
        FileOutputStream fos = new FileOutputStream("/Users/vasanthkumar/IdeaProjects/FirstProject/src/OOPS/Serilization/obj.txt");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        //how to seriliaze

        oos.writeObject(s);

        oos.close();
        fos.close();
        System.out.println("Object state transfer");
    }
}
