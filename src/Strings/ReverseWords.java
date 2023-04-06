package Strings;

import java.util.ArrayList;

public class ReverseWords {
    public static String reverseWords(String s){
        int i=0;
        String temp="";
        String ans="";
        while(i<s.length()){
            temp+=s.charAt(i)+"";
            if(s.charAt(i)=='.'){
               String rev =  reverse(temp);
                ans+=rev;
                temp="";

            }
            i++;
        }
        return ans;

    }

    public static String reverse(String s){
        String rev = "";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i)+"";
        }
        return rev;
    }

    public static String reverseWords1(String s){
        int i=s.length()-1;
        int j=i;
        String ans="";
        while(i>=0){
            if(j>0){
                while(s.charAt(j)!='.'){
                    j--;
                }
            }
            else{
                ans+=s.substring(j,i+1);
                break;
            }

            if(s.charAt(j)=='.'){
                ans+=s.substring(j,i+1);
                i=j;
                j--;
            }
        }
        return ans;
    }
    public static String reverseWords2(String s){
        ArrayList<String> al = new ArrayList<>();
        int i=0;
        int j=i;
        while(i<s.length()){
            if(s.charAt(i)=='.'){
                al.add(s.substring(j,i));
                j=i;
                j++;

            }
            i++;


        }

        al.add(s.substring(j,i));
        System.out.println(al);
        String ans = "";
        for(i=al.size()-1;i>=0;i--){
            if(i==0){
                ans+=al.get(i);
            }
            else{
                ans+=al.get(i)+".";
            }

        }
        return ans;
    }





    public static void main(String[] args) {
        String s = "i.like.this.program.very.much";
        String ans = reverseWords2(s);
        System.out.println(ans);
    }
}
