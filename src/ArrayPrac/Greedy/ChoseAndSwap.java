package ArrayPrac.Greedy;

import java.util.*;

public class ChoseAndSwap {
    static String choseAndSwap(String s){
      List<Character> list = new ArrayList<>();
        TreeSet<Character> treeSet = new TreeSet<>();
        for (int i = 0; i < s.length(); i++) {
            if(!list.contains(s.charAt(i)))
            list.add(s.charAt(i));
            treeSet.add(s.charAt(i));
        }
        List<Character> list1 = new ArrayList<>(treeSet);
//        System.out.println(list);
//        System.out.println(list1);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i)+" "+list1.get(i));
            if(list.get(i)>list1.get(i)){
                for (int j = 0; j < s.length(); j++) {
                    if(s.charAt(j)==list.get(i)){
                        sb.append(list1.get(i));

                    }
                    else if(s.charAt(j)==list1.get(i)){
                        sb.append(list.get(i));

                    }
                    else{
                        sb.append(s.charAt(j));
                    }
                }
                break;

            }
        }

        return sb.toString().length()>0?sb.toString():s;

    }

    public static void main(String[] args) {
        System.out.println(choseAndSwap("ccad"));
        String s = "abcd";
        s.replace('a','f');
        System.out.println(s);
    }
}
