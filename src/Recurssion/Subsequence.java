package Recurssion;
import OOPS.InterfaceDemo.ExtendsDemo.A;

import java.util.ArrayList;
import java.util.Collections;

public class Subsequence {
    static ArrayList<String> subSequence(String s, String ans){

        if(s.length()==0){
            ArrayList<String> al = new ArrayList<>();
            al.add(ans);
            return al;
        }

       ArrayList<String> res =  subSequence(s.substring(1),ans+s.charAt(0));
       ArrayList<String> res1 =  subSequence(s.substring(1),ans);
       res.addAll(res1);
       return res;


    }

    static ArrayList<String> subSequenceIterative(String s){
        ArrayList<String> al = new ArrayList<>();
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            String chr = sb.substring(i,i+1);
            System.out.println(chr);
            if(al.size()>0){
                for (int j = 0; j < al.size(); j++) {
                    al.add((al.get(j)+chr).trim());
                }
            }
            else{
                al.add(chr);
                al.add("");
            }


        }
        Collections.sort(al);
        return al;
    }

    public static void main(String[] args) {
        //System.out.println(subSequenceIterative("abc"));
        System.out.println(subSequence("abc",""));
    }
}
