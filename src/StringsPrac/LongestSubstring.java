package StringsPrac;

import java.util.HashSet;

public class LongestSubstring {
    static int longestSubstring(String str){
        int ans = 0;

        HashSet<Character> hs = new HashSet<>();
        int i=0,j=0;

       while(i<str.length() && j<str.length()){
           if(!hs.contains(str.charAt(j))){
               hs.add(str.charAt(j));
               System.out.println(hs+" 1");
               j++;
               ans =  Math.max(ans,hs.size());
           }
           else{
               if(str.charAt(i) == str.charAt(j)){
                   hs.remove(str.charAt(i));
                   hs.add(str.charAt(j));
                   System.out.println(hs+" 2");
                   i++;
                   j++;
                   ans =  Math.max(ans,hs.size());
               }
               else{
                   while(str.charAt(i)!=str.charAt(j)){
                       hs.remove(str.charAt(i));
                       i++;
                   }
                   hs.remove(str.charAt(i));
                   hs.add(str.charAt(j));
//                   System.out.println(hs+" 3");
//                   System.out.println(str.charAt(i));
//                   System.out.println(i);
//                   System.out.println(str.charAt(j));
//                   System.out.println(j);

                   i++;
                   j++;
               }
           }
       }
        return ans;
    }
    public static void main(String[] args) {
        int ans = longestSubstring("ggububgvfk");
        System.out.println(ans);
    }
}
