package ArrayPrac.SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAnagrams {
    static boolean isAnagram(String s,String p){
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++){
            int idx = (int)s.charAt(i)-97;
            arr[idx]++;

        }
        for(int i=0;i<p.length();i++){
            int idx = (int)p.charAt(i)-97;
            arr[idx]--;

        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0) return false;
        }
        return true;

    }

    static List<Integer> allAnagrams(String s, String p){
        List<Integer> al = new ArrayList<>();
        for (int i = 0; i <=s.length()-p.length(); i++) {
            if(isAnagram(s.substring(i,i+p.length()),p)){
                al.add(i);
            }
        }
        return al;
    }

    public static void main(String[] args) {
      //  System.out.println(isAnagram("abc","bcdaa"));
        System.out.println(allAnagrams("abab","ab"));
    }
}
