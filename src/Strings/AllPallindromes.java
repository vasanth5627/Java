package Strings;

public class AllPallindromes {
    static boolean ispallindrome(String s){
        for(int i=0;i<=s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)) return false;
        }
        return true;
    }
    static void subStrings(String s){
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <=s.length(); j++) {
                if(ispallindrome(s.substring(i,j))){
                    System.out.println(s.substring(i,j));
                }
            }
        }
    }

    public static void main(String[] args) {
     //   System.out.println(ispallindrome("abka"));
        subStrings("abcc");
    }
}
