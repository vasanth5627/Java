package ArrayPrac.SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public class LongestSubstringWithoutRepition {
    static int longestSubstringWithoutRepition(String str){
        int maxLen = Integer.MIN_VALUE;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                Map<Character,Integer> hm = new HashMap<>();
                String s = str.substring(i,j+1);
                for (int k = 0; k < s.length(); k++) {
                   hm.put(s.charAt(k),hm.getOrDefault(s.charAt(k),0)+1);
                }
               // System.out.print(hm+" ");
                AtomicBoolean unique = new AtomicBoolean(true);
                hm.keySet().stream().forEach(e-> {if(hm.get(e)>1) unique.set(false);
                });
               if(unique.get()) maxLen = Math.max(maxLen, hm.size());
            }
       //     System.out.println();
        }
        return maxLen;
    }

    static int longestSubstringWithoutRepetition(String str){
        int i=0;
        int j=0;
        int maxLen = 0;
        Set<Character> set = new HashSet<>();
        while (i<str.length() && j<str.length()){
            if(set.contains(str.charAt(j))){
                maxLen = Math.max(maxLen,set.size());
               set.remove(str.charAt(i));
               i++;
            }
            else{
                set.add(str.charAt(j));
                j++;
            }

        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(longestSubstringWithoutRepition("pwwkew"));
    }
}
