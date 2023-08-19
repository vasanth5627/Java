package Graphs.Problems;

import Graphs.Create.Graph;
import OOPS.InterfaceDemo.ExtendsDemo.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConnectedComponents {

    static List<List<Integer>> getConnectedComponents(ArrayList<Graph.Edge<Integer>>[] graph){
        List<List<Integer>> connectedComponents = new ArrayList<>();
        boolean[] visited = new boolean[graph.length];
        int i=0;
        while(i<graph.length){
            if(!visited[i]){
                List<Integer> comp = new ArrayList<>();
                getConnectedComponent(graph,comp,i,visited);
                connectedComponents.add(comp);
            }
            i++;
        }
        return connectedComponents;
    }

    private static void getConnectedComponent(ArrayList<Graph.Edge<Integer>>[] graph,List<Integer>comp,int src,boolean[] visited) {
        visited[src] = true;
        comp.add(src);
        for (int i = 0; i < graph[src].size(); i++) {
            if(!visited[graph[src].get(i).getDes()])
            getConnectedComponent(graph,comp,graph[src].get(i).getDes(),visited);
        }

    }

    public static void main(String[] args) {
        int[][] arr = {{1},{0},{3},{2},{5,6},{4,6},{4,5}};
        ArrayList<Graph.Edge<Integer>> graph[]= Graph.createGraph(arr,arr.length);
        System.out.println(Arrays.toString(graph));
        System.out.println(getConnectedComponents(graph));
    }
}
