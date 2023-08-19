package Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Arrays;

public class Files {
    public static void main(String[] args) throws IOException {
        String val  = "DataImport";
        String exchange = "BSE";
        String companySymobl = "INFY";
        String fileDir = val+"/"+exchange+"/"+companySymobl+"/"+ LocalDate.now().getYear()+"/"+LocalDate.now().getMonth();
       // boolean b =  new File(exchange+"/"+companySymobl+"/"+ LocalDate.now().getYear()+"/"+LocalDate.now().getMonth()).mkdirs();
      //  System.out.println(b);
        String[] paths = fileDir.split("/");
        for (int i = 1; i < paths.length; i++) {
            paths[i] = paths[i-1]+"/"+paths[i];
        }
        System.out.println(Arrays.toString(paths));

        for (String s: paths) {
            if(!new File(s).exists()){
               boolean b = new File(s).mkdir();
               if(!b) System.out.println(false);

            }


        }
        System.out.println(true);


        //   System.out.println(b);

      //  PrintWriter pw = new PrintWriter(f);
        // f.createNewFile();
    }
}
