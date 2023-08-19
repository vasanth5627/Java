package Graphs.Create;

import java.util.ArrayList;
import java.util.Arrays;

public class Graph {
   public static class Edge<T>{
        T src;
        T des;

        int wt;

        public Edge(T src, T des) {
            this.src = src;
            this.des = des;
        }
       public Edge(T src, T des, int wt) {
           this.src = src;
           this.des = des;
           this.wt = wt;
       }

       public T getSrc() {
           return src;
       }

       public T getDes() {
           return des;
       }

       public int getWt() {
           return wt;
       }

       @Override
        public String toString() {
            if(this.wt>0){
               return src+"-"+des+"@"+wt;
            }
            return src+"-"+des;
        }
    }
    
    public static  ArrayList<Edge<Integer>>[] createGraph(int[][]arr,int v) {
        ArrayList<Edge<Integer>>[] graph = new ArrayList[v];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                graph[i].add(new Edge<>(i, arr[i][j]));

            }
        }

        return graph;
   }
    public static  ArrayList<Edge<Integer>>[] createGraphWithWt(int[][][]arr,int v) {
        ArrayList<Edge<Integer>>[] graph = new ArrayList[v];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                graph[i].add(new Edge<>(i, arr[i][j][0],arr[i][j][1]));
            }
        }

        return graph;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,3},{0,2},{1,3,5},{0,2},{5,6},{4,6},{4,5}};
        int[][][] brr = {{{1,10},{3,40}},{{2,10},{0,10}},{{3,10},{1,10}},{{0,40},{2,10},{4,2}},{{6,8},{5,3}},{{4,3},{6,3}},{{4,8},{5,3}}};
        System.out.println(Arrays.toString(createGraph(arr,arr.length)));
        System.out.println(Arrays.toString(createGraphWithWt(brr,brr.length)));

    }
}
