package Graphs.Problems;

import Graphs.Create.Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;


public class GraphPaths {
    public static boolean hasPath(ArrayList<Graph.Edge<Integer>>[] graph,int src,int des,boolean[] visited){
        if(src==des){
            return true;
        }
        visited[src] = true;
        for (int i = 0; i < graph[src].size(); i++) {
            if(!visited[graph[src].get(i).getDes()]){
                boolean res  = hasPath(graph,graph[src].get(i).getDes(),des,visited);
                if(res) return true;
            }


        }
        return false;

    }
    public static void allPath(ArrayList<Graph.Edge<Integer>>[] graph,int src,int des,boolean[] visited,String psf){
        if(src==des){
            System.out.println(psf);
            return;
        }
        visited[src] = true;
        for (int i = 0; i < graph[src].size(); i++) {
            if(!visited[graph[src].get(i).getDes()]){
                allPath(graph,graph[src].get(i).getDes(),des,visited,psf+graph[src].get(i).getDes());
            }
        }
        visited[src] = false;


    }
    static TreeMap<String,Integer> res = new TreeMap<>();
    public static void multiSolver(ArrayList<Graph.Edge<Integer>>[] graph,int src,int des,boolean[] visited,String psf,int wt){
        if(src==des){
            res.put(psf,wt);
            return;
        }
        visited[src] = true;
        for (int i = 0; i < graph[src].size(); i++) {
            if(!visited[graph[src].get(i).getDes()]){
                multiSolver(graph,graph[src].get(i).getDes(),des,visited,psf+graph[src].get(i).getDes(),wt+graph[src].get(i).getWt());
            }
        }
        visited[src] = false;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,3},{0,2},{1,3,5},{0,2},{5,6},{4,6},{4,5}};
        int[][][] brr = {{{1,10},{3,40}},{{2,10},{0,10}},{{3,10},{1,10}},{{0,40},{2,10},{4,2}},{{6,8},{5,3}},{{4,3},{6,3}},{{4,8},{5,3}}};
        ArrayList<Graph.Edge<Integer>>[] graph = Graph.createGraph(arr,arr.length);
        System.out.println(Arrays.toString(graph));
        System.out.println(hasPath(graph,0,6,new boolean[arr.length]));
        allPath(graph,0,6,new boolean[arr.length],"0");
        ArrayList<Graph.Edge<Integer>>[] graphWithWt = Graph.createGraphWithWt(brr,brr.length);
        multiSolver(graphWithWt,0,6,new boolean[brr.length],"0",0);
        System.out.println(res);

    }
}
