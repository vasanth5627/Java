package ArrayPrac.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithKunique {
    public static int longestkSubstr(String s, int k) {
        // code here
        Map<Character,Integer> hm = new HashMap<>();
        int len=-1;
        int i=0;
        int j=0;
        int count=0;
        while(j<s.length()){
            if(hm.size()==k)
                len = Math.max(len,count);
            if(hm.size()>k){

                if(hm.get(s.charAt(i))>1) {
                    hm.put(s.charAt(i), hm.get(s.charAt(i)) - 1);
                }
                else{
                    hm.remove(s.charAt(i));

                }
                count--;
                i++;
            }

            else{
                hm.put(s.charAt(j),hm.getOrDefault(s.charAt(j),0)+1);
                count++;
                j++;
            }
        }
        System.out.println(hm);

        if(hm.size()==k){
            len = Math.max(len,count);
        }
        return len;
    }

    public static void main(String[] args) {
        System.out.println(longestkSubstr("meayl",2));
    }
}
