package Recurssion;

import java.util.ArrayList;

public class GetMazePaths {
    static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc){
      ArrayList<String> hpaths =   getMazePaths(sr,sc+1,dr,dc);
        ArrayList<String> vpaths =    getMazePaths(sr+1,sc,dr,dc);
        ArrayList<String> paths = new ArrayList<>();
        for(String hpath:hpaths){
            paths.add(hpath+'h');
        }
        for(String vpath:vpaths){
            paths.add(vpath+'v');
        }
        return paths;


    }

    public static void main(String[] args) {
        int n =4;
        System.out.println(getMazePaths(1,1,n,n));
    }
}
