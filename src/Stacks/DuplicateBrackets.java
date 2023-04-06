package Stacks;

import java.util.Stack;

public class DuplicateBrackets {
    static boolean duplicateBrackets(String s){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch=='+' || ch=='-' || ch=='/' || ch=='*'){
                st.push(ch);
            }
            else if(ch==')'){
                boolean op = false;
                while(st.peek()!='('){
                    char temp = st.pop();
                    if(temp=='+' || temp=='-' || temp=='/' || temp=='*'){
                        op=true;
                    }
                }
                if(!op) return true;
                st.pop();
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(duplicateBrackets("(a+b)+((c+d))"));
    }
}
