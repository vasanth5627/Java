package Files;

import java.io.File;

public class TestFiles {
    public static void main(String[] args) {
        File f = new File("/Users/vasanthkumar/IdeaProjects/FirstProject/src/Files/Testfile.txt");
        System.out.println(System.getProperty("user.dir"));
        System.out.println(f.length());
    }
}
