package ArrayPrac;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Interview {
    ////Write a Java Program to count the number of words in a string using HashMap.
    // " This Interview for FOR Vasanth Vas Bud Bud Budmuru"
    public static void main(String[] args) {
        String s = " This Interview for FOR Vasanth Vas Bud Bud Budmuru";
        s=s.trim();
        Map<String,Integer> hm = new HashMap<>();
        String[] names = s.split(" ");
       for(int i=0;i<names.length;i++){
           hm.put(names[i],hm.getOrDefault(hm.get(names[i]),0)+1);
//           if(!hm.containsKey(names[i])){
//               hm.put(names[i],1);
//           }
//           else{
//               hm.put(names[i],hm.get(names[i])+1);
//           }
       }
        System.out.println(hm);
    }
}
