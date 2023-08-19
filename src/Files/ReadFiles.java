package Files;

import OOPS.InterfaceDemo.ExtendsDemo.A;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReadFiles {
    public static void main(String[] args) throws IOException {
        String path = "DataImport/BSE";
        List<String> paths = new ArrayList<>();
        //Object[] arr = Files.walk(Paths.get(path)).filter(a->Files.isRegularFile(a)).forEach(e->paths.add(e.getParent()+"/"+e.getFileName())
        Object[] arr = Files.walk(Paths.get(path)).filter(a -> Files.isRegularFile(a)).map(e -> e.getParent() + "/" + e.getFileName()).collect(Collectors.toList()).toArray();

        System.out.println(Arrays.toString(arr));
        String[] data = "tcs_stockdata.csv".split("\\.");
        //System.out.println(Arrays.toString(data));
        //System.out.println("tcs_stockdata.csv".split(".")[0]);

//        for (Object file :
//                arr) {
//            try (BufferedReader br = new BufferedReader(new FileReader(file+""))) {
//                String line;
//                br.readLine();
//                while ((line = br.readLine()) != null) {
//                    String[] fields = line.split(",");
//                    System.out.println(Arrays.toString(fields));
//                }
//
//
           //}

       // }

//        for(Object file:arr){
//           String[] a = file.toString().split("/");
//            System.out.println(a[2]);
//        }
//
        System.out.println(Files.walk(Paths.get(path)).filter(a-> Files.isRegularFile(a)).collect(Collectors.toList()));
    }
}

