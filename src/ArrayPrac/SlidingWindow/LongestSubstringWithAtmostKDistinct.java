package ArrayPrac.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithAtmostKDistinct {
    static int kDistinct(String str,int k){
        Map<Character,Integer> hm = new HashMap<>();
        int i=0;
        int j=0;
        int maxLen =0;
        int count=0;
        while(j<str.length()){
            if(hm.size()==k)
                maxLen = Math.max(maxLen,count);
            if(hm.keySet().size()>k){
                    if(hm.get(str.charAt(i))>1) {
                        hm.put(str.charAt(i), hm.get(str.charAt(i)) - 1);
                    }
                    else{
                        hm.remove(str.charAt(i));

                    }
                i++;
                count--;

            }
            else{
                hm.put(str.charAt(j),hm.getOrDefault(str.charAt(j),0)+1);
                count++;
                j++;
            }
        }
        if(hm.keySet().size()<=k){
           maxLen= Math.max(maxLen,count);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        System.out.println(kDistinct("abbbbbbc",2));
    }
}
