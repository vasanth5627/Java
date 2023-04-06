package Stacks;

import java.util.Stack;

public class BalancedBrackets {
    static boolean balancedBrackets(String s){
        Stack<Character> st = new Stack<>();
        //(),[],{}

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[') st.push(ch);
            else if(ch==')' || ch=='}' || ch==']'){
                if(st.isEmpty()) return false;
               if(ch==')'){
                   if(st.peek()!='(') return false;
                   else st.pop();
               }
               else if(ch=='}'){
                   if(st.peek()!='{') return false;
                   else st.pop();
               }
               else if(ch==']'){
                   if(st.peek()!='[') return false;
                   else st.pop();
               }
            }
        }
        if(st.isEmpty()) return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(balancedBrackets("[(a + b) + {(c + d) * (e / f)}])"));
    }
}
