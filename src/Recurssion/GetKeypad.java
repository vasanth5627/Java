package Recurssion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetKeypad {
    static String[]  keypad = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static List<String> letterCombinations(String digits){
        if(digits.length()==0){
            ArrayList<String> al = new ArrayList<>();
            al.add("");
            return al;
        }

        char ch  = digits.charAt(0);
        List<String> al  = letterCombinations(digits.substring(1));
        List<String> als = new ArrayList<>();
        String s = keypad[ch-'0'];
        for (int i = 0; i < s.length(); i++) {
            char chcode = s.charAt(i);
            for(String rstr:al){
                als.add(chcode+rstr);
            }
        }
        return als;

    }

    public static void main(String[] args) {

        System.out.println(letterCombinations("578"));

    }
}
