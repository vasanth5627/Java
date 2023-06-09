package ArrayPrac.SlidingWindow;

import static ArrayPrac.SlidingWindow.FindAnagrams.isAnagram;

public class PermutationInString {
    static boolean checkInclusion(String s1, String s2){
        if(s2.length()< s1.length()) return false;
        for (int i = 0; i <=s2.length()-s1.length(); i++) {
            if(isAnagram(s2.substring(i,s1.length()+i),s1)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(checkInclusion("ab","eidbcooo"));
    }
}
