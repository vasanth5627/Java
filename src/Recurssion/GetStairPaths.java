package Recurssion;

import java.util.ArrayList;


public class GetStairPaths {
    static ArrayList<String> getStairPaths(int n){
        if(n==0){
            ArrayList<String> res  = new ArrayList<>();
            res.add("");
            return res;
        }
        else if(n<0){
            ArrayList<String> res  = new ArrayList<>();
            return res;
        }
        ArrayList<String> p1 = getStairPaths(n-1);
        ArrayList<String> p2 = getStairPaths(n-2);
        ArrayList<String> p3 = getStairPaths(n-3);
        ArrayList<String> paths = new ArrayList<>();

        for(String s: p1){
            paths.add(1+s);
        }
        for(String s: p2){
            paths.add(2+s);
        }
        for(String s: p3){
            paths.add(3+s);
        }
        return paths;
    }
    static int count=0;
    static int countWays(int n){
        if(n==0){
            count++;
            return count;
        }
        if(n<0){
            return count;
        }
        countWays(n-1);
        countWays(n-2);
//        countWays(n-3)
        return count;
    }


    public static void main(String[] args) {
        System.out.println(getStairPaths(4));
        System.out.println(countWays(2));
    }

}
