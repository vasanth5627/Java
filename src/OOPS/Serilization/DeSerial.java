package OOPS.Serilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerial {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("/Users/vasanthkumar/IdeaProjects/FirstProject/src/OOPS/Serilization/obj.txt");

        ObjectInputStream ois = new ObjectInputStream(fis);

        Student s = (Student)ois.readObject();
        s.displayName();
    }
}
