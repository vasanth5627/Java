package Strings;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Stack;

public class StringCompression {
    static String removeDuplicate(String s){
        Set<Character> st = new LinkedHashSet<>();
        for(int i=0;i<s.length();i++){
            st.add(s.charAt(i));
        }
        Object[] ch = st.toArray();
        String sn="";
        for (int i = 0; i < ch.length; i++) {
                sn+=ch[i];
        }

        return sn;
    }

    static String removeConsDup(String s){
        String str = ""+s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                str+=s.charAt(i);
            }
        }
      // str+=s.charAt(s.length()-1);
        return str;
    }

    static String countDuplicate(String s){
        Stack<Character> st = new Stack<>();
        String str = "";
//        System.out.println(str);
        int count=0;
        st.push(s.charAt(0));
//        System.out.println(st);
        for(int i=0;i<s.length();i++){
            if(st.peek()!=(s.charAt(i))){
              str+=st.peek()+""+count;
               count=1;
               st.push(s.charAt(i));
            }
            else{
                count++;
            }
        }
        str+=st.peek()+""+count;
//        System.out.println(st);
       return str;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicate("aabbcccd"));
        System.out.println(countDuplicate("aabbbccddd"));
        System.out.println(removeConsDup("aabbbccaaddd"));
    }
}
