package Strings;

import Java8.Streams.Emp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Reverse {
    public static void main(String[] args) {

        List<Emp> employee= new ArrayList<>();
        String inp = "Vasanth Kumar";

        String[] arr = inp.split(" ");

        System.out.println(arr[arr.length-1]+" "+arr[0]);
        //get students whose dept is computer science
       List<Emp> data = employee.stream().filter(e->e.getDepartment().equalsIgnoreCase("ComputerScience")).collect(Collectors.toList());

       data.forEach(e-> System.out.println(e));



    }
}
